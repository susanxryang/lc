
var nums = [3,4,2,3];
const checkPossibility = function(nums) {
    let count = 0;
    let min = 0;
    for(let i = 1; i < nums.length; i++){
        if(nums[i-1] > nums[i]){
          count = count + 1;
          min = nums[i-1]
        }
        if(count > 1 || nums[i] < min){
          return false
        }
    }
    return true;
    // console.log("Hello")
    
};

console.log(checkPossibility(nums));