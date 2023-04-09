package com.SQL_p2.SQL_P2;

import com.SQL_p2.SQL_P2.Entites.Split_ac;
import com.SQL_p2.SQL_P2.Entites.Window_ac;
import com.SQL_p2.SQL_P2.Repository.AirconditionerRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SqlP2ApplicationTests {
	@Autowired
	public AirconditionerRepo airconditionerRepo ;

	@Test
	void contextLoads() {
	}

	@Test
	void CreateAcInfo(){
		Window_ac windowAc = new Window_ac() ;
		windowAc.setId(1);
		windowAc.setAmount(10000);
		windowAc.setWindow_ac_sno("AS1234ERYY");
		airconditionerRepo.save(windowAc) ;

//		Split_ac splitAc = new Split_ac() ;
//		splitAc.setId(1);
//		splitAc.setAmount(10000);
//		splitAc.setSplit_ac_no("SPLT12334ERYY");
//		airconditionerRepo.save(splitAc) ;


	}

}
