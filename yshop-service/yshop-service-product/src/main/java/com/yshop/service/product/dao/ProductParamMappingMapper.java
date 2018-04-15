package com.yshop.service.product.dao;

import com.yshop.service.product.dao.model.ProductParamMapping;
import com.yshop.service.product.dao.model.ProductParamMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductParamMappingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_param_mapping
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int countByExample(ProductParamMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_param_mapping
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int deleteByExample(ProductParamMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_param_mapping
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_param_mapping
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int insert(ProductParamMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_param_mapping
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int insertSelective(ProductParamMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_param_mapping
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    List<ProductParamMapping> selectByExampleWithBLOBs(ProductParamMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_param_mapping
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    List<ProductParamMapping> selectByExample(ProductParamMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_param_mapping
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    ProductParamMapping selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_param_mapping
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductParamMapping record, @Param("example") ProductParamMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_param_mapping
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") ProductParamMapping record, @Param("example") ProductParamMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_param_mapping
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int updateByExample(@Param("record") ProductParamMapping record, @Param("example") ProductParamMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_param_mapping
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int updateByPrimaryKeySelective(ProductParamMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_param_mapping
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ProductParamMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_param_mapping
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int updateByPrimaryKey(ProductParamMapping record);
}