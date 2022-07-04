package ltd.newbee.mall.newbeemall;
import java.util.HashMap;
import java.util.Map;

public class PageUnil extends HashMap<String, Object>{
	
	
	    public int pageNo;
	    public int offSet;
	    public String orderBy;
	    public int limit;
	    
	    public PageUnil(int pageNo,String orderBy,int limit){
	        this.offSet = (pageNo-1) * limit;
	        this.orderBy = orderBy;
	        this.limit = limit;
	        this.pageNo = pageNo;
	        
	    }
	    
	    public PageUnil(Map map){
	        this.putAll(map);
	    }
	    
	}


