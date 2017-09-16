defmodule FizzBuzz do
  def fizzbuzz(n) do
    func = fn i -> 
      case [rem(i, 3), rem(i, 5), i] do
        [0, 0, _] -> "FizzBuzz"
        [0, _, _] -> "Fizz"
        [_, 0, _] -> "Buzz"
        [_, _, i] -> i
      end
    end
    import Enum
    1..n |> map(func) |> each(&IO.puts/1) 
  end
end

defmodule FizzBuzz2 do 
  def to(max) do
    1..max |> Enum.each fn(n) ->
      case {rem(n, 3) === 0, rem(n, 5) === 0} do
        {true, true} -> IO.puts "#{n} FizzBuzz"
        {true, false} -> IO.puts "#{n} Fizz"
        {false, true} -> IO.puts "#{n} Bazz"
        _ -> IO.puts n
      end
    end
  end
end


FizzBuzz.fizzbuzz(30)