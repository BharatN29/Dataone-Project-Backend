package com.maven.DataOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.maven.Impl.Movie;
import com.maven.Repositories.MovieRepository;

@RestController
@EnableJpaRepositories("com.maven.Repositories")
@SpringBootApplication(scanBasePackages={"com.maven.Impl","com.maven.Repositories","com.maven.Config","com.maven.Controllers"})
public class DataOneApplication implements CommandLineRunner {

	@Autowired
	private MovieRepository movieRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DataOneApplication.class, args);
	}
	
	@Override
	public void run(String... args)throws Exception {
		movieRepository.save(new Movie("1921","https://upload.wikimedia.org/wikipedia/en/thumb/2/2a/1921_-_Poster.jpg/220px-1921_-_Poster.jpg","01/11/2018","Thriller/Horror","Karan Kundra, Zareen Khan","Vikram Bhatt"));
		movieRepository.save(new Movie("Tiger Zinda Hai","https://images-na.ssl-images-amazon.com/images/M/MV5BMTYzOTk4OTA5N15BMl5BanBnXkFtZTgwMzUzNDIwNDI@._V1_UX182_CR0,0,182,268_AL_.jpg","12/22/2017","Thriller film/Action","Salman Khan, Katrina Kaif","Ali Abbas Zafar"));
		movieRepository.save(new Movie("Mukkabaaz","https://upload.wikimedia.org/wikipedia/en/5/52/Mukkabaaz_poster_2017.jpg","01/12/2018","Sports/Action","Vineet Kumar Singh, Zoya Hussain","Anurag Kashyap"));
		movieRepository.save(new Movie("Agnyaathavaasi","http://t2.gstatic.com/images?q=tbn:ANd9GcS4RJkbs23E9fO4TT-Y8cGRw6opudQBCPzXgCdCPytVMVavZfkZ","01/09/2018","Thriller/Action","Pawan Kalyan, Keerthy Suresh","S Radha Krishna"));
		movieRepository.save(new Movie("Kaalakaandi","https://i.ytimg.com/vi/XH2vPgekW2k/maxresdefault.jpg","01/12/2018","Comedy/Drama","Saif Ali Khan","Akshat Verma, Saif Ali Khan, Sobhita Dhulipala"));
		movieRepository.save(new Movie("Jumanji: Welcome to the Jungle","http://t2.gstatic.com/images?q=tbn:ANd9GcSGLiKxLm4FSbjNzysaI8xVoUEE27RDObZg9pSiP28nvSEwy7Mb","12/20/2017","Fantasy/Action","Dwayne Johnson, Karen Gillan, Kevin Hart,...","Jake Kasdan"));
		movieRepository.save(new Movie("Insidious: The Last Key","http://t1.gstatic.com/images?q=tbn:ANd9GcTE0r-ZiGH8aV-Nz4j9KHtrv_UdL-rioSlcb8PGkUHjxaoUxolc","01/04/2018","Mystery/Thriller","Lin Shaye, Leigh Whannell","Adam Robitel"));
		movieRepository.save(new Movie("Vodka Diaries","http://data1.ibtimes.co.in/cache-img-318-0-photo/en/full/79929/1513918146_intriguing-first-look-poster-vodka-diaries-released.jpg","01/19/2018","Thriller film","Kay Kay Menon, Raima Sen, Mandira Bedi","Kushal Srivastava"));
		movieRepository.save(new Movie("Jolly LLB 2","http://t2.gstatic.com/images?q=tbn:ANd9GcQYJIGmlwN42rEKMWU4uwpHLfQwkF5y2cRpnkCjNVWl7_yJDvtJ","02/10/2017","Comedy/Drama","Akshay Kumar, Huma Qureshi","Subhash Kapoor"));
		movieRepository.save(new Movie("Toilet: Ek Prem Katha","http://t3.gstatic.com/images?q=tbn:ANd9GcQLdGTEweFj4JZqAF6WzdWwfmTfL_q7hRR70m9vqjOaDweyka3X","08/11/2017","Comedy-drama/Romance","Akshay Kumar, Bhumi Pednekar","Shree Narayan Singh"));
		movieRepository.save(new Movie("Baahubali 2: The Conclusion","https://i.ytimg.com/vi/JS4drCVGIms/maxresdefault.jpg","04/28/2017","Fantasy/Action","Prabhas, Anushka Shetty, Rana Daggubati","S S Rajamouli"));
		movieRepository.save(new Movie("Golmaal Again","http://t1.gstatic.com/images?q=tbn:ANd9GcT5nywoEqd9srnL1WIT4_jQA1jm39uKtExrYrtwkMKNbKFgTvc4","10/20/2017","Fantasy/Bollywood","Ajay Devgan, Arshad Warsi, Tusshar Kapoor, Kunal Khemu, Parineeti Chopra, Tabu","Rohit Shetty"));
		movieRepository.save(new Movie("Raabta","http://t2.gstatic.com/images?q=tbn:ANd9GcRwchuikezYdG9hqmBbwmmr9tdIfH__1xP1huKeeRLmFkQm7cWA","06/09/2017","Mystery/Action","Sushant Singh Rajput, Kriti Sanon","Dinesh Vijan"));
		movieRepository.save(new Movie("Simran","http://t2.gstatic.com/images?q=tbn:ANd9GcSCeVUIIEw8I-Eg3sIdYO8WfpQE-AKhYYEaffjGeSObLfnKwJPV","09/15/2017","Crime film/Thriller","Sohum Shah, Kangana Ranaut","Hansal Mehta"));
		movieRepository.save(new Movie("Sachin: A Billion Dreams","http://t2.gstatic.com/images?q=tbn:ANd9GcQ3SnrOjU-4XNYQkn5iQ72pRyevnXHHS4w0REI2A41Z9VAk8oOY","05/26/2017","Sport/Biography","Sachin Tendulkar","James Erskine"));
		movieRepository.save(new Movie("Ok Jaanu","http://t0.gstatic.com/images?q=tbn:ANd9GcS6tNzbhG_WQvoi2Ne0RK84SDCMyKftqwoSuIL0fUPGaZ1qqElq","01/13/2017","Romance/Drama","Aditya Roy Kapur, Shraddha Kapoor","Shaad Ali"));
		movieRepository.save(new Movie("Dangal","http://t3.gstatic.com/images?q=tbn:ANd9GcQIXnFlBKGWT1ByyIu3qfxX6opQX6BmeeU_qsiE3X8rX9ZRr63r","12/23/2016","Sport/Action","Aamir Khan, Fatima Sana Shaikh, Zaira Wasim, Sanya Malhotra","Nitesh Tiwari"));
		movieRepository.save(new Movie("Airlift","http://t3.gstatic.com/images?q=tbn:ANd9GcTHssC2lZ7sucnosiSRhwgT9_aZHwgr5wkEGWyX1Ov69cgAd8YS","01/22/2016","Thriller/Action","Akshay Kumar, Nimrat Kaur","Raja Krishna Menon"));
		movieRepository.save(new Movie("Sultan","http://t2.gstatic.com/images?q=tbn:ANd9GcS1cK4t_uWmqHaRYD9uq69hLEWy7f7NpIfjPlQECdooplpkQcEp","07/06/2016","Sport/Action","Salman Khan, Anushka Sharma","Ali Abbas Zafar"));
		movieRepository.save(new Movie("M.S.Dhoni:The Untold Story","http://t0.gstatic.com/images?q=tbn:ANd9GcSbgMguXb4cBUMBEdZkYA_CpjHWHQQpPPNrMnBvp5PDeXiMedL-","09/30/2016","Bollywood/Sport","Sushant Singh Rajput, Disha Patani, Kiara Advani","Neeraj Pandey"));
		movieRepository.save(new Movie("Rustom","http://t3.gstatic.com/images?q=tbn:ANd9GcT4H2JWKIA8a2_gGVSStPrGQNwGCJHbkbsx_q7Ue1cXN1k1wvC7","08/12/2016","Mystery/Crime film","Akshay Kumar, Ileana DCruz","Tinu Suresh Desai"));
		movieRepository.save(new Movie("Housefull 3","http://www.gstatic.com/tv/thumb/movieposters/12893097/p12893097_p_v8_ab.jpg","06/03/2016","Action/Romance","Akshay Kumar,Jacqueline Fernandez, Nargis Fakhri,...","Farhad Samji, Sajid"));
		movieRepository.save(new Movie("Shivaay","http://t0.gstatic.com/images?q=tbn:ANd9GcSBw3rCCEuA2Oi5E7LlELBEnm8o3PDnoof4EBvWdj6ZzLkXOQAS","10/28/2016","Thriller/Action","Ajay Devgan, Sayesha Saigal","Ajay Devgan"));
		movieRepository.save(new Movie("Befikre","http://t1.gstatic.com/images?q=tbn:ANd9GcTgd7bcKGy4_1BN2n6eZHUUC3jnATg5tOlrRypnjuRQgycHqwSl","12/09/2016","Romance/Comedy","Ranveer Singh, Vaani Kapoor","Aditya Chopra"));

	}
}
