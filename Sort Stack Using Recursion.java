// Q.Given a stack, the task is to sort it such that the top of the stack has the greatest element.
/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        if(!s.isEmpty()){
            int element = s.pop();
            sort(s);
            inserttopelement(s, element);
        }
        return s;
    }
    public void inserttopelement(Stack<Integer> s , int element){
        if (s.isEmpty() || s.peek() <= element) {
            s.push(element);
        } else {
            int temp = s.pop();
            inserttopelement(s, element); // Insert recursively
            s.push(temp); // Push back the stored element
        }
    }
}
