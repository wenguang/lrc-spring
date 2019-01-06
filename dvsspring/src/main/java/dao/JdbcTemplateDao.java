package dao;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class JdbcTemplateDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void update() {
        String sql = "update t_customer set name='mengjun' where name='mj'";
        jdbcTemplate.update(sql);
    }

    public void query() {
        String sql = "select * from cms_menu";
        List<CmsMenu> list = jdbcTemplate.query(sql, new RowMapper<CmsMenu>() {
            public CmsMenu mapRow(ResultSet resultSet, int i) throws SQLException {
                CmsMenu menu = new CmsMenu();
                menu.menuId = resultSet.getInt("menu_id");
                menu.pId = resultSet.getInt("pid");
                menu.name = resultSet.getString("name");
                menu.url = resultSet.getString("url");
                menu.target = resultSet.getString("target");
                return menu;
            }
        });
        System.out.println(list);
    }
}
