const N = +require('fs').readFileSync('/dev/stdin').toString();
let result = 0;
for (let i = 1; i * i <= N; i++) {
  result++;
}
console.log(result);