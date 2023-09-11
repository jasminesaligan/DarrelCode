public class ArrayPractice
{

	public static void main(String[] args) {
		
		char [] nn = {'r', 'e', 'r', 'e'};
		
// 		System.out.println(nn[3]);
// 		System.out.println(nn[2]);
// 		System.out.println(nn[1]);
// 		System.out.println(nn[0]);
		
// 		for (int i = 0; i < nn.length; i++) {
//             System.out.println(nn[i]);
//         }
        
//         for (int i = nn.length -1; i >= 0; i--) {
//             System.out.println(nn[i]);
//         }
        
        for (int i = 0; i < nn.length; i++) {
            if (!(nn[i] == 'e')) {
                System.out.println(nn[i]);
            }
        }
	}
}
