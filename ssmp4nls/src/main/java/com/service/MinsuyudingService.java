package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MinsuyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MinsuyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MinsuyudingView;


/**
 * 民宿预订
 *
 * @author 
 * @email 
 * @date 2022-04-16 16:55:50
 */
public interface MinsuyudingService extends IService<MinsuyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MinsuyudingVO> selectListVO(Wrapper<MinsuyudingEntity> wrapper);
   	
   	MinsuyudingVO selectVO(@Param("ew") Wrapper<MinsuyudingEntity> wrapper);
   	
   	List<MinsuyudingView> selectListView(Wrapper<MinsuyudingEntity> wrapper);
   	
   	MinsuyudingView selectView(@Param("ew") Wrapper<MinsuyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MinsuyudingEntity> wrapper);
   	

}

