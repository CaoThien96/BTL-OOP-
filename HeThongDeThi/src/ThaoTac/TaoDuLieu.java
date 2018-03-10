/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThaoTac;

import Model.CauHoi;
import Model.CauHoiTL;
import Model.CauHoiTN;
import Model.DapAnTN;
import ModelMonHoc.DeThi;
import ModelMonHoc.MonHoc;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author CaoThienHUST
 */
public class TaoDuLieu {
    private static CauHoiTN ch1,ch2,ch3,ch4,ch5,ch6;
    private static CauHoiTL chtl1,chtl2,chtl3,chtl4,chtl5,chtl6,chtl7,chtl8,chtl9,chtl10;
    private static ArrayList<DapAnTN> dsDA1,dsDA2,dsDA3,dsDA4,dsDA5,dsDA6;
    
    private static ArrayList<CauHoi> dsCauHoi=new ArrayList<>();
    private static ArrayList<CauHoi> dsCauHoita=new ArrayList<>();
    private static ArrayList<DeThi> dsDeThi=new ArrayList<>();
    private static DapAnTN da1,da2,da3;
    
    private static MonHoc monToan=new MonHoc("Toán");
    private static MonHoc monTiengAnh=new MonHoc("Tiếng Anh");
    private static MonHoc monHoa=new MonHoc("Hóa");
    private static MonHoc monLy=new MonHoc("Lý");
    private static ArrayList<MonHoc> dsMonHoc=new ArrayList<>();
    private static int a;
    
    public static void taoDuLieu() {
        
        ch1=taoCauHoi(ch1, dsDA1, "2+1=?", "A=3", "B=4","C=5", 1,1,0);
        dsCauHoi.add(ch1);
        ch2=taoCauHoi(ch2, dsDA2, "3+4=?", "A=4", "B=5", "C=7",1,1,2);  
        dsCauHoi.add(ch2);

        ch3=taoCauHoi(ch3, dsDA3, "2+5=?", "A=3", "B=7", "C=5",1,2,1);
        dsCauHoi.add(ch3);

        ch4=taoCauHoi(ch4, dsDA4, "11*2=?", "A=4", "B=5", "C=22",1,2,2);
        dsCauHoi.add(ch4);
        
        ch5=taoCauHoi(ch5, dsDA5, "28/4=?", "A=7", "B=8", "C=9",1,3,0);
        dsCauHoi.add(ch5);
        
        ch6=taoCauHoi(ch6, dsDA6, "4^2=?", "A=15", "B=16", "C=17",2,3,1);
        dsCauHoi.add(ch6);
        
        chtl1=new CauHoiTL();
        chtl1.setDeBai("giải phương trình\n" + "X+1=1/2 ");
        chtl1.setGoiYDapAn("X=-1/2");
        chtl1.setChuong(2);dsCauHoi.add(chtl1);
        
        chtl2=new CauHoiTL();
        chtl2.setDeBai("giải phương trình \n" + "5X+1=11");
        chtl2.setGoiYDapAn("X=2");
        chtl2.setChuong(2);dsCauHoi.add(chtl2);
        
        chtl3=new CauHoiTL();
        chtl3.setDeBai("giải phương trình\n" + "X^2-1=0");
        chtl3.setGoiYDapAn("X=+-1");
        chtl3.setChuong(2);dsCauHoi.add(chtl3);
        
        chtl4=new CauHoiTL();
        chtl4.setDeBai("Tính chu vi tâm giác ABC có AB=1 BC=2 AC=3");
        chtl4.setGoiYDapAn("P(ABC)=6");
        chtl4.setDoKho(1);
        chtl4.setChuong(2);
        dsCauHoi.add(chtl4);

        chtl5=new CauHoiTL("67524,67542,76524,76542", "Viết các số theo thứ tự từ bé đến lớn:\n67524,67542,76524,76542",2,1);
        dsCauHoi.add(chtl5);
        
        chtl6=new CauHoiTL("a:Chiều rộng:15m,chiều dài:16m\nb:Diện tích:54m2"," Một thửa ruộng hình chữ nhật có nữa chu vi bằng 45 mét, chiều dài hơn chiều rộng 27 mét\n a:Tính số đo chiều rộng và tính số đo chiều dài của thửa ruộng hình chữ nhật đó.\n b:Tính diện tích thửa ruộng hình chữ nhật đó.",3,3);
        dsCauHoi.add(chtl6);
        
        chtl7=new CauHoiTL("20050","Tính nhẩm: 2005 x 10 =? ",1,1);
        dsCauHoi.add(chtl7);
        
        chtl8=new CauHoiTL("1094m2", "Một cái sân hình chữ nhật có chu vi 108m và có chiều rộng là 18m. Tính diện tích cái sân đó.",2, 2);
        dsCauHoi.add(chtl8);
        
        chtl9=new CauHoiTL("287m", "May mỗi bộ quần áo cần có 3m 50cm vải. Hỏi:May 82 bộ quần áo như thế cần có bao nhiêu mét vải?", 2, 4);
        dsCauHoi.add(chtl9);
        
        chtl10=new CauHoiTL("15 tấn", "Một đội thợ mỏ khai thác than, theo kế hoạch mỗi ngày phải khai thác được 55 tấn than.\nKhi thực hiện, mỗi ngày đội khai thác được 60 tấn than. Do đó, đội đã hoàn thành kế hoạch\ntrước 2 ngày mà còn vượt mức 15 tấn than. Hỏi theo kế hoạch, đội phải khai thác bao nhiêu tấn than ?",3, 4);
        dsCauHoi.add(chtl10);
        monToan.setArrCauHoi(dsCauHoi);
        
        DeThi dt1=new DeThi("Đề 15p trắc nghiệm","Toán");
        ArrayList<CauHoi> dsCauDeThi1=new ArrayList<>();
        dsCauDeThi1.add(ch1);dsCauDeThi1.add(ch2);dsCauDeThi1.add(ch3);dsCauDeThi1.add(ch4);dsCauDeThi1.add(ch5);
        dt1.setDsCauHoi(dsCauDeThi1);dsDeThi.add(dt1);
        
        DeThi dt2=new DeThi("Đề 45p Tự luận","Toán");
        ArrayList<CauHoi> dsCauDeThi2=new ArrayList<>();
        dsCauDeThi2.add(chtl1);dsCauDeThi2.add(chtl3);dsCauDeThi2.add(chtl5);dsCauDeThi2.add(chtl7);dsCauDeThi2.add(chtl9);
        dt2.setDsCauHoi(dsCauDeThi2);dsDeThi.add(dt2);
        
        DeThi dt3=new DeThi("Đề 15p tổng hợp","Toán");
        ArrayList<CauHoi> dsCauDeThi3=new ArrayList<>();
        dsCauDeThi3.add(ch1);dsCauDeThi3.add(ch2);dsCauDeThi3.add(ch3);dsCauDeThi3.add(chtl4);dsCauDeThi3.add(chtl5);
        dt3.setDsCauHoi(dsCauDeThi3);dsDeThi.add(dt3);
        monToan.setDsDeThi(dsDeThi);
        
        dsMonHoc.add(monToan);
        dsMonHoc.add(monTiengAnh);
        dsMonHoc.add(monHoa);
        dsMonHoc.add(monLy);
    }
    
    public static CauHoiTN taoCauHoi(CauHoiTN ch,ArrayList<DapAnTN> dsDA,String debai,String da1,String da2,String da3,int chuong,int doKho,int dung){
        ch=new CauHoiTN();
        ch.setDeBai(debai);
        ch.setChuong(chuong);
        ch.setDoKho(doKho);
        dsDA=new ArrayList<>();
        dsDA.add(new DapAnTN(da1));dsDA.add(new DapAnTN(da2));dsDA.add(new DapAnTN(da3));
        dsDA.get(dung).setIsTrue(true);
        ch.setArrCacDapAn(dsDA);
       
        return ch;
    }
    public static void outPutDuLieu(){
        
        try {
            FileOutputStream fos =new FileOutputStream("MonHoc.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(dsMonHoc);
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public static void main(String[] args) {
        taoDuLieu();  
        outPutDuLieu();
    }
}
