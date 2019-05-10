package answer;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        while(!StdIn.isEmpty()) {
            String s = StdIn.readString();

            // 实现方式一：
            switch (s) {
                case "(":
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "sqrt":
                    ops.push(s);
                    break;
                case ")":
                    String op = ops.pop();
                    double v = vals.pop();
                    switch (op) {
                        case "+":
                            v = vals.pop() + v;
                            break;
                        case "-":
                            v = vals.pop() - v;
                            break;
                        case "*":
                            v = vals.pop() * v;
                            break;
                        case "/":
                            v = vals.pop() / v;
                            break;
                        case "sqrt":
                            v = Math.sqrt(v);
                            break;
                    }
                    vals.push(v);
                    break;
                default:
                    vals.push(Double.parseDouble(s));
            }

            //实现方式二：
//            if (s.equals("("))
//                ;
//            else if(s.equals("+"))
//                ops.push(s);
//            else if(s.equals("-"))
//                ops.push(s);
//            else if(s.equals("*"))
//                ops.push(s);
//            else if(s.equals("/"))
//                ops.push(s);
//            else if(s.equals("sqrt"))
//                ops.push(s);
//            else if(s.equals(")")){
//                String op = ops.pop();
//                double v = vals.pop();
//                if(op.equals("+"))
//                    v = vals.pop() + v;
//                else if(op.equals("-"))
//                    v = vals.pop() - v;
//                else if(op.equals("*"))
//                    v = vals.pop() * v;
//                else if(op.equals("/"))
//                    v = vals.pop() / v;
//                else if(op.equals("sqrt"))
//                    v = Math.sqrt(v);
//                vals.push(v);
//            }
//
//            else
//                vals.push(Double.parseDouble(s));
        }
        StdOut.println(vals.pop());
    }
}
