
const input = prompt();
const numbers = input.split(' ').map(Number);

numbers.sort(function(a, b)
 {
    return b - a;
}
);

console.log("Sorted in descending order:", numbers);
