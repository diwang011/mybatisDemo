package com.next.db.mapper;

import com.next.db.model.FunProduct;
import com.next.db.model.FunProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funproduct
     *
     * @mbggenerated Sun Mar 04 17:09:19 CST 2018
     */
    int countByExample(FunProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funproduct
     *
     * @mbggenerated Sun Mar 04 17:09:19 CST 2018
     */
    int deleteByExample(FunProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funproduct
     *
     * @mbggenerated Sun Mar 04 17:09:19 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funproduct
     *
     * @mbggenerated Sun Mar 04 17:09:19 CST 2018
     */
    int insert(FunProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funproduct
     *
     * @mbggenerated Sun Mar 04 17:09:19 CST 2018
     */
    int insertSelective(FunProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funproduct
     *
     * @mbggenerated Sun Mar 04 17:09:19 CST 2018
     */
    List<FunProduct> selectByExample(FunProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funproduct
     *
     * @mbggenerated Sun Mar 04 17:09:19 CST 2018
     */
    FunProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funproduct
     *
     * @mbggenerated Sun Mar 04 17:09:19 CST 2018
     */
    int updateByExampleSelective(@Param("record") FunProduct record, @Param("example") FunProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funproduct
     *
     * @mbggenerated Sun Mar 04 17:09:19 CST 2018
     */
    int updateByExample(@Param("record") FunProduct record, @Param("example") FunProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funproduct
     *
     * @mbggenerated Sun Mar 04 17:09:19 CST 2018
     */
    int updateByPrimaryKeySelective(FunProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table funproduct
     *
     * @mbggenerated Sun Mar 04 17:09:19 CST 2018
     */
    int updateByPrimaryKey(FunProduct record);
}