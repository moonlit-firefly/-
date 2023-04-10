package com.iweb.DAO.impl;

import com.iweb.DAO.FunctionDAO;
import com.iweb.pojo.*;
import com.iweb.util.JDBCUtil;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈郅治
 * @date 2023/3/21  21:34
 **/
public class FunctionImplementation implements FunctionDAO {

    @Override
    public List<Manager> getManagerList() {
        List<Manager> managerList=new ArrayList<>();
        String sql="select * from manager";
        try(Connection c=JDBCUtil.getConnection();
        PreparedStatement ps=c.prepareStatement(sql)){
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Manager manager=new Manager();
                manager.setId(rs.getInt("id"));
                manager.setManagerName(rs.getString("mname"));
                manager.setManagerPassword(rs.getString("password"));
                managerList.add(manager);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return managerList;
    }

    @Override
    public boolean insertTempInfo(Temperature temperature) {
        return insertTempInfo(temperature.getTemperature());
    }

    @Override
    public boolean insertTempInfo(String tempValue) {
        String sql = "insert into temperature(temp,gmt_created) " +
                "values(?,NOW())";
        try (Connection c = JDBCUtil.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1,tempValue);
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Temperature> getTempList() {
        return null;
    }

    @Override
    public boolean insertHumInfo(Humidity humidity) {
        return insertHumInfo(humidity.getHumidity());
    }

    @Override
    public boolean insertHumInfo(String humValue) {
        String sql = "insert into humidity(hum,gmt_created) " +
                "values(?,NOW())";
        try (Connection c = JDBCUtil.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1,humValue);
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Humidity> getHumList() {
        List<Humidity> humidities=new ArrayList<>();
        String sql="select * from humidity";
        try(Connection c=JDBCUtil.getConnection();
            PreparedStatement ps=c.prepareStatement(sql)){
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Humidity humidity=new Humidity();
                humidity.setId(rs.getInt("id"));
                humidity.setHumidity(rs.getString("hum"));
                humidity.setGmtCreated(rs.getDate("gmt_created"));
                humidities.add(humidity);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return humidities;
    }

    @Override
    public boolean insertLightInfo(Light light) {
        return insertLightInfo(light.getLightIntensity());
    }

    @Override
    public boolean insertLightInfo(String lightValue) {
        String sql = "insert into light(light_intensity,gmt_created) " +
                "values(?,NOW())";
        try (Connection c = JDBCUtil.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1,lightValue);
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Light> getLightList() {
        List<Light>  lights=new ArrayList<>();
        String sql="select * from light";
        try(Connection c=JDBCUtil.getConnection();
            PreparedStatement ps=c.prepareStatement(sql)){
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Light light=new Light();
                light.setId(rs.getInt("id"));
                light.setLightIntensity(rs.getString("light_intensity"));
                light.setGmtCreated(rs.getDate("gmt_created"));
                lights.add(light);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return lights;
    }

    @Override
    public boolean insertSoundInfo(Sound sound) {
        return insertSoundInfo(sound.getSoundIntensity());
    }

    @Override
    public boolean insertSoundInfo(String soundValue) {
        String sql = "insert into sound(sound_intensity,gmt_created) " +
                "values(?,NOW())";
        try (Connection c = JDBCUtil.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1,soundValue);
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Sound> getSoundList() {
        List<Sound>  sounds=new ArrayList<>();
        String sql="select * from sound";
        try(Connection c=JDBCUtil.getConnection();
            PreparedStatement ps=c.prepareStatement(sql)){
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Sound sound=new Sound();
                sound.setId(rs.getInt("id"));
                sound.setSoundIntensity(rs.getString("sound_intensity"));
                sound.setGmtCreated(rs.getDate("gmt_created"));
                sounds.add(sound);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return sounds;
    }
}
