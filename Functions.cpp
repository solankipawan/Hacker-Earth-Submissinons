/* Functions are a bunch of statements glued together. A function is provided with zero or more arguments, and it executes the statements on it.
Based on the return type, it either returns nothing (void) or something.
You have to write a function int max_of_four(int a, int b, int c, int d) which reads four arguments and returns the greatest of them.

+= : Add and assignment operator. It adds the right operand to the left operand and assigns the result to the left operand.
a += b is equivalent to a = a + b;
Input Format

Input will contain four integers -a,b,c,d,one in each line.

Output Format

Print the greatest of the four integers.
PS: I/O will be automatically handled.
*/
#include <iostream>
#include <cstdio>
#include<algorithm> 

using namespace std;

int max_of_four(int a, int b, int c, int d){
    int e = std::max(a,b);
    int f = std::max(e,c);
    int g = std::max(f,d);

    return g;

}
int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}
