package com.jcpdev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jcpdev.dto.Comment;
import com.jcpdev.dto.Customer;
import com.jcpdev.dto.Freeboard;
import com.jcpdev.dto.Gallery;
import com.jcpdev.dto.SessionDto;
import com.jcpdev.mybatis.SqlSessionBean;

public class GalleryDao {
	
	SqlSessionFactory factory = SqlSessionBean.getSessionFactory();
	private static GalleryDao dao = new GalleryDao();
	
	private GalleryDao() { }
	public static GalleryDao getInstance() {
		return dao;
	}

	public List<Gallery> getList(){
		List<Gallery> list = null;
		SqlSession mapper = factory.openSession();
		list = mapper.selectList("gallery.getAll");
		mapper.close();
		return list;
	}
	
	public void insert(Gallery g) {
		SqlSession mapper = factory.openSession();
		mapper.insert("gallery.insert",g);
		mapper.commit();
		mapper.close();
	}

}
