#include <bits/stdc++.h>
using namespace std;
int main() {
	int t;
	cin >> t;
	while(t--) {
	    int n;
	    cin >> n;
	   
	    int imp = 0, random=0, count0=0, count1=0, countn1=0;
	    for(int i=0; i<n; i++) {
	        int a;
	        cin >> a;
	        if((a == 0)) {
	            count0++;
	        } else if(a==1) {
	            count1++;
	        } else if(a==-1) {
	            countn1++;
	        } else {
	            random++;
	        }
	    }
	   
	   if(random>1 || (countn1>1 && count1==0) || (random>0 && countn1>0) ) {
	       cout << "no" << endl;
	       continue;
	   } else {
	       cout << "yes" << endl;
	   }
	}
	return 0;
}