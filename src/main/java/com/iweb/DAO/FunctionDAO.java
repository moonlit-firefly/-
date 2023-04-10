package com.iweb.DAO;

import com.iweb.pojo.*;

import java.util.List;

/**
 * @author 陈郅治
 * @date 2023/3/21  21:35
 **/
public interface FunctionDAO {
    /**获取管理员对象列表
     * @return 管理员对象列表
     */
    List<Manager> getManagerList();

    /**根据温度对象向数据库温度表中插入数据
     * @param temperature 温度对象
     * @return 是否插入成功
     */
    boolean insertTempInfo(Temperature temperature);

    /**根据温度值向数据库温度表中插入数据
     * @param tempValue 温度值
     * @return 是否插入成功
     */
    boolean insertTempInfo(String tempValue);

    /**获取温度对象列表
     * @return 温度对象列表
     */
    List<Temperature> getTempList();

    /**根据湿度对象向数据库湿度表中插入数据
     * @param humidity 湿度对象
     * @return 是否插入成功
     */
    boolean insertHumInfo(Humidity humidity);

    /**根据湿度值向数据库湿度表中插入数据
     * @param humValue 湿度值
     * @return 是否插入成功
     */
    boolean insertHumInfo(String humValue);

    /**获取湿度对象列表
     * @return 湿度对象列表
     */
    List<Humidity> getHumList();

    /**根据光照对象向数据库光照表中插入数据
     * @param light 光照对象
     * @return 是否插入成功
     */
    boolean insertLightInfo(Light light);

    /**根据光照值向数据库光照表中插入数据
     * @param lightValue 光照值
     * @return 是否插入成功
     */
    boolean insertLightInfo(String lightValue);

    /**获取光照对象列表
     * @return 光照对象列表
     */
    List<Light> getLightList();

    /**根据声音对象向数据库声音表中插入数据
     * @param sound 声音对象
     * @return 是否插入成功
     */
    boolean insertSoundInfo(Sound sound);

    /**根据声音值向数据库声音表中插入数据
     * @param soundValue 声音值
     * @return 是否插入成功
     */
    boolean insertSoundInfo(String soundValue);

    /**获取声音对象列表
     * @return 声音对象列表
     */
    List<Sound> getSoundList();

}
