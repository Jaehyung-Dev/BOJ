const [K, N, M] = require('fs').readFileSync('/dev/stdin').toString().split(' ').map(el => +el);
let result;

if((K * N) <= M) {
  result = 0;
} else {
  result = (K * N) - M;
}

console.log(result);