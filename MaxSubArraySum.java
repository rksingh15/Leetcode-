int maxSub Array= Integer.MIN_VALUE;
int current sum=0;


for(int i = 0 ; i<n ; i++){

	for(int j = 0 ; j<n ; j++){
		currentSubArraySum=0;
	
		for(int k= i ; k<=j ; k++){

			currentsubArray+=num[k];
		}
	  maxSubArraySum = Math.Max( maxSubArraySum, CurrentSubArraySum);
}
}	

Next method  to solve 

	for(int i = 0 ; i<n ; i++){
			currentSubArraySum=0;
		for(int j = 0 ; j<n ; j++){

			currentsubArray+=num[k];
		
			  maxSubArraySum = Math.Max( maxSubArraySum, CurrentSubArraySum);
		}
}
