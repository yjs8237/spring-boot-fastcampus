package kr.co.fastcampus.fcstudy.account.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_account")
@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pkid")
    private Long pkid;

    @Column(name = "name")
    private String username;

    @Column(name = "password")
    private String password;


}
