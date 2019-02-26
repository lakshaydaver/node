package list;

import javax.xml.soap.Node;

public class lists {

    private int data;


    private Node next;


    public int getdata() {
        return data;
    }


    public void setdata(int data) {
        this.data = data;
    }

    public Node getnext() {
        return next;
    }


    public void setnext(Node next) {
        this.next = next;
    }


    public Node(int data) {

        this.data = data;

    }

    public Node() {

        this.data = 0;
        this.next = null;

    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;

    }


    public Node(int data, Node next) {
        this.data = data;
        this.next = next;

    }


    private Node head = null;
    private int size = 0;

    public static void main(String[] args) {


        lists linkedlist = new lists();
        System.out.println(linkedlist);

        linkedlist.inserthead(42);
        linkedlist.inserthead(44);
        System.out.println(linkedlist);

    }

    public String toString() {


        StringBuilder response = new StringBuilder();

        response.append("[");

        Node temp=this.head;
        while(temp!=null)
        {

            response.append(temp.getdata());
if(temp.next!=null)
{

    respond.append("==>")

}

       temp=temp.next;

        }

        response.append("]");

        return response.toString();


    }




    private void inserthead(int data)
    {

        Node  newnode=new Node(data,this.head);

        this.head=newnode;
        size++;

    }




    private  void insertafter(int data,Node node)
    {

        Node newnode=new Node(data, node next);

        node.next=newnode;
        size++;




    }
    public void insert(int data)
    {
        if(head==null)
        {


            inserthead(data);

        }
        else
        {
            Node temp=this.head;

            while(temp.next!=null)
            {


                temp=temp.next;
            }
        insertafter(data,temp);
        }



    }

}



