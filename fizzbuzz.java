class fizzbuzz{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        for(int i=1; i<=n; i++){
            String o = i%3==0?"Fizz":"";
            o+=i%5==0?"Buzz":"";
            o+=o.length()==0?i:"";
            System.out.println(o);
        }
    }
}