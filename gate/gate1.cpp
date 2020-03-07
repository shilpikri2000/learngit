#include<iostream>
using namespace std;
int main(){
    char menu;
    int result ;
    int datavalue1;
    int datavalue2;
    cout<<"Enter your boolean operator code:(A,O,N,X):";
    cin>>menu;
    switch(menu){
        case'A':
        cout<<"Enter 1st boolean value";
        cin>>datavalue1;
        cout<<"Enter 2nd boolean value";
        cin>>datavalue2;
        if(datavalue1==1&&datavalue2==1){
            result=1;
        }else{
            result=0;
        }
        cout<<"show result"<<result;
        break;
      
      case'O':
      
       cout<<"Enter 1st boolean value";
        cin>>datavalue1;
        cout<<"Enter 2nd boolean value";
        cin>>datavalue2;
        if(datavalue1==1||datavalue2==1){
            result=1;
        }else{
            result=0;
        }
        cout<<"show result"<<result;
        break;
     case'N':
        
        cout<<"Enter 1st boolean value";sx
        cin>>datavalue1;
       if(datavalue1=!datavalue1){
        result=1;
        }else{
            result=0;
        }
        cout<<"show result"<<result;
        break;
        case'x':
       cout<<"Enter 1st boolean value";
        cin>>datavalue1;
        cout<<"Enter 2nd boolean value";
        cin>>datavalue2;
        if(datavalue1=!datavalue1){
            result=1;
        }else{
            result=0;
        }
        cout<<"show result"<<result;
        break;
        deafault:
        result=0;
        break;
    }
    cin.ignore(2);
    return 0;
    
}