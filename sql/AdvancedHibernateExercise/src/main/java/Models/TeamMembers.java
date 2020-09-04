package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="team_members", schema="advancedhibernateexercise")
public class TeamMembers implements Serializable {

    @Id
    @Column(name="team_id")
    private long teamId;

    @Id
    @Column(name="team_member_id")
    private long teamMemberId;

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public long getTeamMemberId() {
        return teamMemberId;
    }

    public void setTeamMemberId(long teamMemberId) {
        this.teamMemberId = teamMemberId;
    }

    @Override
    public String toString() {
        return "TeamMembers{" +
                "teamId=" + teamId +
                ", teamMemberId=" + teamMemberId +
                '}';
    }
}
