package nu.nerd.modreq.database;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.bukkit.Location;

import com.avaje.ebean.validation.NotEmpty;
import com.avaje.ebean.validation.NotNull;

@Entity()
@Table(name = "modreq_requests")
public class Request {

    public enum RequestStatus {
        CLOSED, CLAIMED, OPEN
    }

    @Id
    private int id;

    @NotNull
    private String playerName;
    private String assignedMod;

    @NotEmpty
    private String request;

    @NotNull
    private long requestTime;

    @NotNull
    private RequestStatus status;

    @NotNull
    private String requestLocation;
    private String closeMessage;
    private long closeTime;
    private boolean closeSeenByUser;
    private boolean flagForAdmin;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setAssignedMod(String assignedMod) {
        this.assignedMod = assignedMod;
    }

    public String getAssignedMod() {
        return this.assignedMod;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getRequest() {
        return this.request;
    }

    public void setRequestTime(long requestTime) {
        this.requestTime = requestTime;
    }

    public long getRequestTime() {
        return this.requestTime;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    public RequestStatus getStatus() {
        return this.status;
    }

    public void setRequestLocation(String requestLocation) {
        this.requestLocation = requestLocation;
    }

    public String getRequestLocation() {
        return this.requestLocation;
    }

    public void setCloseMessage(String closeMessage) {
        this.closeMessage = closeMessage;
    }

    public String getCloseMessage() {
        return this.closeMessage;
    }

    public void setCloseTime(long closeTime) {
        this.closeTime = closeTime;
    }

    public long getCloseTime() {
        return this.closeTime;
    }

    public void setCloseSeenByUser(boolean closeSeenByUser) {
        this.closeSeenByUser = closeSeenByUser;
    }

    public boolean isCloseSeenByUser() {
        return this.closeSeenByUser;
    }

    public void setFlagForAdmin(boolean flagForAdmin) {
        this.flagForAdmin = flagForAdmin;
    }

    public boolean isFlagForAdmin() {
        return this.flagForAdmin;
    }
}
