package com.dao;

import com.entity.YaopinfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaopinfenleiVO;
import com.entity.view.YaopinfenleiView;


/**
 * 药品分类
 * 
 * @author 
 * @email 
 * @date 2023-02-25 09:50:45
 */
public interface YaopinfenleiDao extends BaseMapper<YaopinfenleiEntity> {
	
	List<YaopinfenleiVO> selectListVO(@Param("ew") Wrapper<YaopinfenleiEntity> wrapper);
	
	YaopinfenleiVO selectVO(@Param("ew") Wrapper<YaopinfenleiEntity> wrapper);
	
	List<YaopinfenleiView> selectListView(@Param("ew") Wrapper<YaopinfenleiEntity> wrapper);

	List<YaopinfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YaopinfenleiEntity> wrapper);
	
	YaopinfenleiView selectView(@Param("ew") Wrapper<YaopinfenleiEntity> wrapper);
	

}
