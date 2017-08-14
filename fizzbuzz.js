function fizzbuzz(till) {
    for (var i = 1; i <= till; i++) {
        if (i % 15 == 0) {
            print('FizzBuzz');
        } else if (i % 3 == 0) {
            print('Fizz');
        } else if (i % 5 == 0) {
            print('Buzz');
        } else {
            print(i);
        }
    }
}
fizzbuzz(50);
print('------------------------------------');
function fizzbuzz2(till) {
    for (var i = 1; i <= till; i++) {
        print(i % 3 == 0 ? (i % 5 == 0 ? 'FizzBuzz' : 'Fizz') : (i % 5 == 0 ? 'Buzz' : i));
    }
}
fizzbuzz2(30);