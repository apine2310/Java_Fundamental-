package java_20191210.Gdao;

import java.util.ArrayList;

import java_20191210.Gdto.GradeDto;
import java_20191210.dao.DeptDao;
import java_20191210.dto.DeptDto;

public class GradeDemo {

	public static void main(String[] args) {
		GradeDao d = GradeDao.getInstance();
		
		//boolean isSuccess = d.insert(new DeptDto(50, "DEVELOPERS", "TEXAS"));
		//System.out.println(isSuccess);
		
		//boolean isSuccess = d.update(new DeptDto(50,"DEVELOPERS","LA"));
		//System.out.println(isSuccess);
		
		//boolean isSuccess = d.delete(50);
		//System.out.println(isSuccess);
		/*
		ArrayList<GradeDto> list = d.select();
		
		for (GradeDto dto : list) {
			System.out.printf("%d, %d, %d %n", dto.getGrade(), dto.getLosal(), dto.getHisal());
		}
		*/
		System.out.println();
		
		GradeDto dto = d.select(1);
		if(dto == null){
			System.out.println("데이터가 존재하지 않습니다.");
		}else{
			System.out.printf("%d , %d , %d %n", dto.getGrade(), dto.getLosal(), dto.getHisal());
		}
	}

}
