package jp.co.internous.ecsite.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.internous.ecsite.model.dto.HistoryDto;

@Mapper

public interface Tb1PurchaseMapper {
	
	List<HistoryDto> findHistory(int userId);
	
	int insert(int userId,int goodsId,String goodsName,int itemCount,int total);

}
