public class factorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(2)); 
        emailVerification("yandex.ru");
    }
        public static int getFactorial(int num) {
            int result=1;
            if(num < 1) throw new RuntimeException("Число - "+num+" меньше 1");
            for(int i=1; i<=num;i++){
                result*=i;
            }
            return result;
    }

    public static  void emailVerification(String email){
        if (!email.contains("@mail.ru")){
            throw new RuntimeException("email введен неверно");
        }
        System.out.println(email+" введен правильно");
    }

    public static void mult(int a, int b){
        
    }
}

