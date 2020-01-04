package com.Attence.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Attence.dao.ATTENCEdao;
import com.Attence.dao.BaseDao;
import com.Attence.entity.ATTENCE;

public class ATTENCEdaoImpl extends BaseDao implements ATTENCEdao {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	@Override
	public List<ATTENCE> getShow() {
		// TODO 自动生成的方法存根
		List<ATTENCE> list = new ArrayList<ATTENCE>();
		try {
			conn = this.getConnection();
			String sql = "SELECT * FROM `attence` ORDER BY `CHKDATE` DESC";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				ATTENCE attence = new ATTENCE();
				attence.setID(rs.getInt("ID"));
				attence.setEMPNAME(rs.getString("EMPNAME"));
				attence.setDEPT(rs.getString("DEPT"));
				attence.setCHKDATE(rs.getString("CHKDATE"));
				attence.setSTATUS(rs.getInt("STATUS"));
				list.add(attence);
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			this.closeAll(conn, psmt, rs);
		}
		return list;
	}

	@Override
	public int getadd(ATTENCE attence) {
		// TODO 自动生成的方法存根
		String sql = "INSERT INTO `attence` (`EMPNAME`,`DEPT`,`CHKDATE`,`STATUS`) VALUES(?,?,?,?)";
		Object [] addition = {attence.getEMPNAME(),attence.getDEPT(),attence.getCHKDATE(),attence.getSTATUS()};
		return this.executeUpdate(sql, addition);
	}

	@Override
	public int getmodification(ATTENCE attence) {
		// TODO 自动生成的方法存根
		int modification = 0;
		try {
			conn = this.getConnection();
			String sql = "UPDATE `attence` SET `EMPNAME` = ?,`DEPT` = ?,`CHKDATE`=NOW(),`STATUS` = ? WHERE `ID` = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, attence.getEMPNAME());
			psmt.setString(2, attence.getDEPT());
			psmt.setInt(3, attence.getSTATUS());
			psmt.setInt(4, attence.getID());
			modification = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			this.closeAll(conn, psmt, rs);
		}
		return modification;
	}

	@Override
	public int delete(int ID) {
		// TODO 自动生成的方法存根
		int dele = 0;
		try {
			conn = this.getConnection();
			String sql = "DELETE FROM `attence` WHERE `ID` = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, ID);
			dele = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			this.closeAll(conn, psmt, rs);
		}
		return dele;
	}

	@Override
	public ATTENCE transfer(int ID) {
		// TODO 自动生成的方法存根
		ATTENCE attence = null;
		try {
			conn = this.getConnection();
			String sql = "SELECT * FROM `attence` WHERE `ID`= ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, ID);
			rs = psmt.executeQuery();
			while(rs.next()) {
				attence = new ATTENCE();
				attence.setEMPNAME(rs.getString("EMPNAME"));
				attence.setDEPT(rs.getString("DEPT"));
				attence.setCHKDATE(rs.getString("CHKDATE"));
				attence.setSTATUS(rs.getInt("STATUS"));
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			this.closeAll(conn, psmt, rs);
		}
		
		return attence;
	}

}
