package com.slack.api.methods.request.team;

import com.slack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Data;

/**
 * https://api.slack.com/methods/team.billableInfo
 */
@Data
@Builder
public class TeamBillableInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `admin`
     */
    private String token;

    /**
     * A user to retrieve the billable information for. Defaults to all users.
     */
    private String user;

    /**
     * Required for org-wide apps.
     */
    private String teamId;

}