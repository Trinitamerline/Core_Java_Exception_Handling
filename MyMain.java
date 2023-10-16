import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,d=0;
        char c;
        BadOperandException boe;
        BadOperatorException bre;
        OperationFailedException ofe;
        try {
            System.out.println("Enter first operand:");
            a = scanner.nextInt();
            if(!(a>=10000 && a<=50000))
            {
                boe = new BadOperandException(a);
                ofe = new OperationFailedException("First Number");
                ofe.initCause(boe);
                throw ofe;
            }
            System.out.println("Enter Second operand:");
            b = scanner.nextInt();
            if(!(b>=500 && b<=5000))
            {
               boe = new BadOperandException(b);
               ofe = new OperationFailedException("Second Number");
               ofe.initCause(boe);
               throw ofe;
            }
            System.out.println("Enter operator:");
            c = scanner.next().charAt(0);
            if(!(c == '+' || c == '-' || c =='*' || c=='/'))
            {
                bre = new BadOperatorException(c);
                ofe = new OperationFailedException("Operator");
                ofe.initCause(bre);
                throw ofe;
            }
            switch(c)
            {
                case '+':
                     d = a+b;
                     break;
                case '-':
                    d = a-b;
                    break;
                case '*':
                    d = a*b;
                    break;
                case '/':
                    d = a/b;
                    break;
            }
            System.out.println(a+" "+c+" "+b+"="+d);

        }catch (OperationFailedException e)
        {
            System.out.println("Actual Exception:"+e);
            System.out.println("Root Cause:"+e.getCause());
        }
    }
}
