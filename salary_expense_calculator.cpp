#include <iostream>
using namespace std;
class salary{
    private:
    int sallary_t;
    string month;
    public:
        salary(){
cout<<"Enter your salary\n";
cin>>sallary_t;
cout<<"Enter your month for salary\n";
cin>>month;
        }
        int getsalary()
        {
            return sallary_t;
        }
        string getmonth()
        {
            return month;
        }
};
class expense : public salary{
private:
    int expense_amount;
    string mounth;
public:
    expense()
    {
        cout<<"Enter your expense"<<endl;
        cin>>expense_amount;
        cout<<"Month of expense"<<endl;
        cin>>mounth;
    }
    int getexpense()
    {
        return expense_amount;
    }
    string getmounth()
    {
        return mounth;
    }
};
class calcu : public expense {
private:
    int total;
public:
    void calculation()
    {
        if(getmonth()==getmounth())
        {
           total=getsalary()-getexpense();
        }
        else
        {
            cout<<"Write same month for calculation"<<endl;
        }
    }
    void display()
    {

        cout<<"Your monthly salary"<<endl;
        cout<<getsalary()<<endl;
        cout<<"your monthly expense"<<endl;
        cout<<getexpense()<<endl;
        if(getmonth()==getmounth())
        {
           cout<<"your left amount"<<endl;
           cout<<total;
        }
        else
        {
            cout<<"No calculation found because mismatch of month"<<endl;
        }
    }
};
int main()
{
    calcu obj2;
    obj2.calculation();
    obj2.display();
    return 0;
}
