#include<iostream>
using namespace std;
struct Node {
   int data;
   struct Node *next;
   struct Node *previous;
};
struct Node* head = NULL;
void insert(int newdata) {
   struct Node *newnode = (struct Node *)malloc(sizeof(struct Node));
   struct Node *ptr = head;
   newnode->data = newdata;
   newnode->next = head;
   if (head!= NULL) {
      ptr = ptr->previous;
      ptr->next = newnode;
     head->previous=newnode;
     newnode->previous = ptr;
   } else{
   newnode->next = newnode;
   newnode->previous = newnode;}
   head = newnode;
}
struct Node* move(int n,struct Node* p2){
  for(int i=1;i<n;i++){p2=p2->next;}
  return p2;
}
struct Node* del(struct Node* p){
    struct Node *p3 = p;
    p3 = p3->previous;
    p3->next=p->next;
    p3->next->previous=p3;
    if(p==head){head=p->next;}
    free(p);
  return p3->next;
}
int main()
{
  int n,k;
  cin>>n;
  for(int i=n;i>=1;i--){insert(i);}
  cin>>k;
  struct Node* p4=head;
  while(head->next!=head){
    p4=move(k,p4);
    p4=del(p4);
  }
  cout<<head->data;
  return 0;
}