#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node* next;
};
struct node* push(struct node* ,int);
struct node* pop(struct node*);

void display(struct node*);

void main()
{
    int ch,item;
    struct node* tos=NULL;
    while(1)
    {
        printf("\n1.push \n2.pop \n3.Display \n4.Exit \nEnter your choice: ");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:printf("Enter element: ");
                   scanf("%d",&item);
                   tos=push(tos,item);
                   break;
            case 2:tos=pop(tos);
                   break;
            case 3:display(tos);
                   break;
            case 4:exit(1);
            default:printf("Wrong choice!!");

        }
    }
}

struct node* push(struct node* s,int x)
{
    struct node* temp;
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=x;
    temp->next=s;
    s=temp;
    return temp;
};

struct node* pop(struct node*s)
{
    struct node* temp;
    if(s==NULL)
    {
        printf("\n Stack underflow");
        return s;
    }
    temp=s;
    s=s->next;
    printf("popped element is %d",temp->data);
    free(temp);
    return s;
};

void display(struct node* s)
{
    struct node* temp;

    temp=s;
    if(temp==NULL)
    {
        printf("stack is empty");
        return;
    }
    printf("Elements in the stack are: ");
    while(temp!=NULL)
    {
        printf("\n %d",temp->data);
        temp=temp->next;
    }
    printf("\n");
}
