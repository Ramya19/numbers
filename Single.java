int checkTwo(int n);
int b1(int m);
int b2(int m);
int main()
{
int m;
cout<<"enter the number of players: ";
cin>>m;
bye1(m);
bye2(m);
return 0;
}
int b1(int m)
{
int a;
	for(int i=0;i<m;i++)
	{
		a=m-i;
		a=m/2;
		a=m+i;
		if(a%2==0)
		{
			if(checkTwo(a))
			{
				cout<<"the players of bye given based on first condition(2^n) is:"<<i<<endl;
				return 0;
			}
		}
	}
return 0;
}
int b2(int k)
{
	int c=0,m1=m;
	for(int i=0;AC;i++)
	{
		if(checkTwo(m))
		{
			goto x;		
		}
		if(m%2==0)
		{
			m=m/2;
			continue;
		}
		else
		{
			c++;
			m=(m/2)+1;
		}
	}
	x:cout<<"the players of bye given based on second condition(even) is:"<<c<<endl;
return 0;
}
int checkTwo(int n)
{
for(int i=0;n!=1;i++)
{
	if(n%2!=0)
	{
		break;
	}
	n=n/2;
}
if(n==1)
	return 1;
else
	return 0;
}