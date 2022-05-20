package br.pucrs.engswii.beans;

import java.util.ArrayList;
import java.util.List;

public class SubjectRegistration {

	private List<Subject> subjectRecords;

    private static SubjectRegistration sbjregd = null;

    private SubjectRegistration(){
		subjectRecords = new ArrayList<Subject>();
	}

    public static SubjectRegistration getInstance() {

		if(sbjregd == null) {
			sbjregd = new SubjectRegistration();
			return sbjregd;
		}
		else {
			return sbjregd;
		}
	}

    public void add(Subject sbj) {
		subjectRecords.add(sbj);
	}

    public String upDateSubject(Subject sbj) {

		for(int i=0; i<subjectRecords.size(); i++)
		{
			Subject sbjn = subjectRecords.get(i);
			if(sbjn.getCode().equals(sbj.getCode())) {
				subjectRecords.set(i, sbj);//update the new record
				return "Update successful";
			}
		}

		return "Update un-successful";
	}

    public String deleteSubject(String code) {

		for(int i=0; i<subjectRecords.size(); i++)
		{
			Subject sbjn = subjectRecords.get(i);
			if(sbjn.getCode().equals(code)){
				subjectRecords.remove(i);//update the new record
				return "Delete successful";
			}
		}

		return "Delete un-successful";
	}

	public Subject getSubject(String code, String schedule){
		Subject rply = null;
		for(Subject sbj: subjectRecords){
			if(sbj.getCode().equals(code) && sbj.getSchedule().equals(schedule)){
				rply = sbj;
				break;
			}
		}
		return rply;
	}

	public List<Subject> getSubjectRecords() {
		return subjectRecords;
	}
}