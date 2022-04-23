#include <bits/stdc++.h>
using namespace std;

int main(){

    int t;
    cin>>t;
    while(t--){
        int n,s;
        cin >> n>> s;
        if( s < n){ //sum < number
        // return sum
        cout<< s << '\n';
        }else {
            // n = 9 s = 10;
            //s - n = 1
            // 18 - 10 = 8 , 8 -4 = 4 , 6 - 5
            cout<< n * 2 - s;
        }
    }
}
