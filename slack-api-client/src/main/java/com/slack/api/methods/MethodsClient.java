package com.slack.api.methods;

import com.slack.api.RequestConfigurator;
import com.slack.api.methods.request.admin.apps.*;
import com.slack.api.methods.request.admin.conversations.AdminConversationsSetTeamsRequest;
import com.slack.api.methods.request.admin.emoji.*;
import com.slack.api.methods.request.admin.invite_requests.*;
import com.slack.api.methods.request.admin.teams.AdminTeamsAdminsListRequest;
import com.slack.api.methods.request.admin.teams.AdminTeamsCreateRequest;
import com.slack.api.methods.request.admin.teams.AdminTeamsListRequest;
import com.slack.api.methods.request.admin.teams.owners.AdminTeamsOwnersListRequest;
import com.slack.api.methods.request.admin.teams.settings.*;
import com.slack.api.methods.request.admin.users.*;
import com.slack.api.methods.request.api.ApiTestRequest;
import com.slack.api.methods.request.apps.AppsUninstallRequest;
import com.slack.api.methods.request.apps.permissions.AppsPermissionsInfoRequest;
import com.slack.api.methods.request.apps.permissions.AppsPermissionsRequestRequest;
import com.slack.api.methods.request.apps.permissions.resources.AppsPermissionsResourcesListRequest;
import com.slack.api.methods.request.apps.permissions.scopes.AppsPermissionsScopesListRequest;
import com.slack.api.methods.request.apps.permissions.users.AppsPermissionsUsersListRequest;
import com.slack.api.methods.request.apps.permissions.users.AppsPermissionsUsersRequestRequest;
import com.slack.api.methods.request.auth.AuthRevokeRequest;
import com.slack.api.methods.request.auth.AuthTestRequest;
import com.slack.api.methods.request.bots.BotsInfoRequest;
import com.slack.api.methods.request.channels.*;
import com.slack.api.methods.request.chat.*;
import com.slack.api.methods.request.chat.scheduled_messages.ChatScheduledMessagesListRequest;
import com.slack.api.methods.request.conversations.*;
import com.slack.api.methods.request.dialog.DialogOpenRequest;
import com.slack.api.methods.request.dnd.*;
import com.slack.api.methods.request.emoji.EmojiListRequest;
import com.slack.api.methods.request.files.*;
import com.slack.api.methods.request.files.comments.FilesCommentsAddRequest;
import com.slack.api.methods.request.files.comments.FilesCommentsDeleteRequest;
import com.slack.api.methods.request.files.comments.FilesCommentsEditRequest;
import com.slack.api.methods.request.files.remote.*;
import com.slack.api.methods.request.groups.*;
import com.slack.api.methods.request.im.*;
import com.slack.api.methods.request.migration.MigrationExchangeRequest;
import com.slack.api.methods.request.mpim.*;
import com.slack.api.methods.request.oauth.OAuthAccessRequest;
import com.slack.api.methods.request.oauth.OAuthTokenRequest;
import com.slack.api.methods.request.oauth.OAuthV2AccessRequest;
import com.slack.api.methods.request.pins.PinsAddRequest;
import com.slack.api.methods.request.pins.PinsListRequest;
import com.slack.api.methods.request.pins.PinsRemoveRequest;
import com.slack.api.methods.request.reactions.ReactionsAddRequest;
import com.slack.api.methods.request.reactions.ReactionsGetRequest;
import com.slack.api.methods.request.reactions.ReactionsListRequest;
import com.slack.api.methods.request.reactions.ReactionsRemoveRequest;
import com.slack.api.methods.request.reminders.*;
import com.slack.api.methods.request.rtm.RTMConnectRequest;
import com.slack.api.methods.request.rtm.RTMStartRequest;
import com.slack.api.methods.request.search.SearchAllRequest;
import com.slack.api.methods.request.search.SearchFilesRequest;
import com.slack.api.methods.request.search.SearchMessagesRequest;
import com.slack.api.methods.request.stars.StarsAddRequest;
import com.slack.api.methods.request.stars.StarsListRequest;
import com.slack.api.methods.request.stars.StarsRemoveRequest;
import com.slack.api.methods.request.team.TeamAccessLogsRequest;
import com.slack.api.methods.request.team.TeamBillableInfoRequest;
import com.slack.api.methods.request.team.TeamInfoRequest;
import com.slack.api.methods.request.team.TeamIntegrationLogsRequest;
import com.slack.api.methods.request.team.profile.TeamProfileGetRequest;
import com.slack.api.methods.request.usergroups.*;
import com.slack.api.methods.request.usergroups.users.UsergroupsUsersListRequest;
import com.slack.api.methods.request.usergroups.users.UsergroupsUsersUpdateRequest;
import com.slack.api.methods.request.users.*;
import com.slack.api.methods.request.users.profile.UsersProfileGetRequest;
import com.slack.api.methods.request.users.profile.UsersProfileSetRequest;
import com.slack.api.methods.request.views.ViewsOpenRequest;
import com.slack.api.methods.request.views.ViewsPublishRequest;
import com.slack.api.methods.request.views.ViewsPushRequest;
import com.slack.api.methods.request.views.ViewsUpdateRequest;
import com.slack.api.methods.response.admin.apps.*;
import com.slack.api.methods.response.admin.conversations.AdminConversationsSetTeamsResponse;
import com.slack.api.methods.response.admin.emoji.*;
import com.slack.api.methods.response.admin.invite_requests.*;
import com.slack.api.methods.response.admin.teams.AdminTeamsAdminsListResponse;
import com.slack.api.methods.response.admin.teams.AdminTeamsCreateResponse;
import com.slack.api.methods.response.admin.teams.AdminTeamsListResponse;
import com.slack.api.methods.response.admin.teams.owners.AdminTeamsOwnersListResponse;
import com.slack.api.methods.response.admin.teams.settings.*;
import com.slack.api.methods.response.admin.users.*;
import com.slack.api.methods.response.api.ApiTestResponse;
import com.slack.api.methods.response.apps.AppsUninstallResponse;
import com.slack.api.methods.response.apps.permissions.AppsPermissionsInfoResponse;
import com.slack.api.methods.response.apps.permissions.AppsPermissionsRequestResponse;
import com.slack.api.methods.response.apps.permissions.resources.AppsPermissionsResourcesListResponse;
import com.slack.api.methods.response.apps.permissions.scopes.AppsPermissionsScopesListResponse;
import com.slack.api.methods.response.apps.permissions.users.AppsPermissionsUsersListResponse;
import com.slack.api.methods.response.apps.permissions.users.AppsPermissionsUsersRequestResponse;
import com.slack.api.methods.response.auth.AuthRevokeResponse;
import com.slack.api.methods.response.auth.AuthTestResponse;
import com.slack.api.methods.response.bots.BotsInfoResponse;
import com.slack.api.methods.response.channels.*;
import com.slack.api.methods.response.chat.*;
import com.slack.api.methods.response.chat.scheduled_messages.ChatScheduledMessagesListResponse;
import com.slack.api.methods.response.conversations.*;
import com.slack.api.methods.response.dialog.DialogOpenResponse;
import com.slack.api.methods.response.dnd.*;
import com.slack.api.methods.response.emoji.EmojiListResponse;
import com.slack.api.methods.response.files.*;
import com.slack.api.methods.response.files.comments.FilesCommentsAddResponse;
import com.slack.api.methods.response.files.comments.FilesCommentsDeleteResponse;
import com.slack.api.methods.response.files.comments.FilesCommentsEditResponse;
import com.slack.api.methods.response.files.remote.*;
import com.slack.api.methods.response.groups.*;
import com.slack.api.methods.response.im.*;
import com.slack.api.methods.response.migration.MigrationExchangeResponse;
import com.slack.api.methods.response.mpim.*;
import com.slack.api.methods.response.oauth.OAuthAccessResponse;
import com.slack.api.methods.response.oauth.OAuthTokenResponse;
import com.slack.api.methods.response.oauth.OAuthV2AccessResponse;
import com.slack.api.methods.response.pins.PinsAddResponse;
import com.slack.api.methods.response.pins.PinsListResponse;
import com.slack.api.methods.response.pins.PinsRemoveResponse;
import com.slack.api.methods.response.reactions.ReactionsAddResponse;
import com.slack.api.methods.response.reactions.ReactionsGetResponse;
import com.slack.api.methods.response.reactions.ReactionsListResponse;
import com.slack.api.methods.response.reactions.ReactionsRemoveResponse;
import com.slack.api.methods.response.reminders.*;
import com.slack.api.methods.response.rtm.RTMConnectResponse;
import com.slack.api.methods.response.rtm.RTMStartResponse;
import com.slack.api.methods.response.search.SearchAllResponse;
import com.slack.api.methods.response.search.SearchFilesResponse;
import com.slack.api.methods.response.search.SearchMessagesResponse;
import com.slack.api.methods.response.stars.StarsAddResponse;
import com.slack.api.methods.response.stars.StarsListResponse;
import com.slack.api.methods.response.stars.StarsRemoveResponse;
import com.slack.api.methods.response.team.TeamAccessLogsResponse;
import com.slack.api.methods.response.team.TeamBillableInfoResponse;
import com.slack.api.methods.response.team.TeamInfoResponse;
import com.slack.api.methods.response.team.TeamIntegrationLogsResponse;
import com.slack.api.methods.response.team.profile.TeamProfileGetResponse;
import com.slack.api.methods.response.usergroups.*;
import com.slack.api.methods.response.usergroups.users.UsergroupsUsersListResponse;
import com.slack.api.methods.response.usergroups.users.UsergroupsUsersUpdateResponse;
import com.slack.api.methods.response.users.*;
import com.slack.api.methods.response.users.profile.UsersProfileGetResponse;
import com.slack.api.methods.response.users.profile.UsersProfileSetResponse;
import com.slack.api.methods.response.views.ViewsOpenResponse;
import com.slack.api.methods.response.views.ViewsPublishResponse;
import com.slack.api.methods.response.views.ViewsPushResponse;
import com.slack.api.methods.response.views.ViewsUpdateResponse;
import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.Response;

import java.io.IOException;

/**
 * Slack API Methods client.
 * <p>
 * c<a href="https://api.slack.com/methods">Slack API Methods</a>
 */
public interface MethodsClient {

    String ENDPOINT_URL_PREFIX = "https://slack.com/api/";

    String getEndpointUrlPrefix();

    void setEndpointUrlPrefix(String endpointUrlPrefix);

    // ----------------------------------------------
    //  OkHttp layer methods
    // ----------------------------------------------

    Response runPostForm(
            FormBody.Builder form,
            String endpoint) throws IOException;

    Response runPostFormWithToken(
            FormBody.Builder form,
            String endpoint,
            String token) throws IOException;

    Response runPostMultipart(
            MultipartBody.Builder form,
            String endpoint,
            String token) throws IOException;

    // ----------------------------------------------
    //  Methods to send requests and parse responses
    // ----------------------------------------------

    <T extends SlackApiResponse> T postFormAndParseResponse(
            RequestConfigurator<FormBody.Builder> form,
            String endpoint,
            Class<T> clazz) throws IOException, SlackApiException;

    <T extends SlackApiResponse> T postFormWithAuthorizationHeaderAndParseResponse(
            RequestConfigurator<FormBody.Builder> form,
            String endpoint,
            String authorizationHeader,
            Class<T> clazz) throws IOException, SlackApiException;

    <T extends SlackApiResponse> T postFormWithTokenAndParseResponse(
            RequestConfigurator<FormBody.Builder> form,
            String endpoint,
            String token,
            Class<T> clazz) throws IOException, SlackApiException;

    <T extends SlackApiResponse> T postMultipartAndParseResponse(
            RequestConfigurator<MultipartBody.Builder> form,
            String endpoint,
            String token,
            Class<T> clazz) throws IOException, SlackApiException;

    // ------------------------------
    // admin.apps
    // ------------------------------

    AdminAppsApproveResponse adminAppsApprove(AdminAppsApproveRequest req) throws IOException, SlackApiException;

    AdminAppsApproveResponse adminAppsApprove(RequestConfigurator<AdminAppsApproveRequest.AdminAppsApproveRequestBuilder> req) throws IOException, SlackApiException;

    AdminAppsRestrictResponse adminAppsRestrict(AdminAppsRestrictRequest req) throws IOException, SlackApiException;

    AdminAppsRestrictResponse adminAppsRestrict(RequestConfigurator<AdminAppsRestrictRequest.AdminAppsRestrictRequestBuilder> req) throws IOException, SlackApiException;

    AdminAppsApprovedListResponse adminAppsApprovedList(AdminAppsApprovedListRequest req) throws IOException, SlackApiException;

    AdminAppsApprovedListResponse adminAppsApprovedList(RequestConfigurator<AdminAppsApprovedListRequest.AdminAppsApprovedListRequestBuilder> req) throws IOException, SlackApiException;

    AdminAppsRestrictedListResponse adminAppsRestrictedList(AdminAppsRestrictedListRequest req) throws IOException, SlackApiException;

    AdminAppsRestrictedListResponse adminAppsRestrictedList(RequestConfigurator<AdminAppsRestrictedListRequest.AdminAppsRestrictedListRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // admin.apps.requests
    // ------------------------------

    AdminAppsRequestsListResponse adminAppsRequestsList(AdminAppsRequestsListRequest req) throws IOException, SlackApiException;

    AdminAppsRequestsListResponse adminAppsRequestsList(RequestConfigurator<AdminAppsRequestsListRequest.AdminAppsRequestsListRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // admin.conversations
    // ------------------------------

    AdminConversationsSetTeamsResponse adminConversationsSetTeams(AdminConversationsSetTeamsRequest req) throws IOException, SlackApiException;

    AdminConversationsSetTeamsResponse adminConversationsSetTeams(RequestConfigurator<AdminConversationsSetTeamsRequest.AdminConversationsSetTeamsRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // admin.emoji
    // ------------------------------

    AdminEmojiAddResponse adminEmojiAdd(AdminEmojiAddRequest req) throws IOException, SlackApiException;

    AdminEmojiAddResponse adminEmojiAdd(RequestConfigurator<AdminEmojiAddRequest.AdminEmojiAddRequestBuilder> req) throws IOException, SlackApiException;

    AdminEmojiAddAliasResponse adminEmojiAddAlias(AdminEmojiAddAliasRequest req) throws IOException, SlackApiException;

    AdminEmojiAddAliasResponse adminEmojiAddAlias(RequestConfigurator<AdminEmojiAddAliasRequest.AdminEmojiAddAliasRequestBuilder> req) throws IOException, SlackApiException;

    AdminEmojiListResponse adminEmojiList(AdminEmojiListRequest req) throws IOException, SlackApiException;

    AdminEmojiListResponse adminEmojiList(RequestConfigurator<AdminEmojiListRequest.AdminEmojiListRequestBuilder> req) throws IOException, SlackApiException;

    AdminEmojiRemoveResponse adminEmojiRemove(AdminEmojiRemoveRequest req) throws IOException, SlackApiException;

    AdminEmojiRemoveResponse adminEmojiRemove(RequestConfigurator<AdminEmojiRemoveRequest.AdminEmojiRemoveRequestBuilder> req) throws IOException, SlackApiException;

    AdminEmojiRenameResponse adminEmojiRename(AdminEmojiRenameRequest req) throws IOException, SlackApiException;

    AdminEmojiRenameResponse adminEmojiRename(RequestConfigurator<AdminEmojiRenameRequest.AdminEmojiRenameRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // admin.inviteRequests
    // ------------------------------

    AdminInviteRequestsApproveResponse adminInviteRequestsApprove(AdminInviteRequestsApproveRequest req) throws IOException, SlackApiException;

    AdminInviteRequestsApproveResponse adminInviteRequestsApprove(RequestConfigurator<AdminInviteRequestsApproveRequest.AdminInviteRequestsApproveRequestBuilder> req) throws IOException, SlackApiException;

    AdminInviteRequestsDenyResponse adminInviteRequestsDeny(AdminInviteRequestsDenyRequest req) throws IOException, SlackApiException;

    AdminInviteRequestsDenyResponse adminInviteRequestsDeny(RequestConfigurator<AdminInviteRequestsDenyRequest.AdminInviteRequestsDenyRequestBuilder> req) throws IOException, SlackApiException;

    AdminInviteRequestsListResponse adminInviteRequestsList(AdminInviteRequestsListRequest req) throws IOException, SlackApiException;

    AdminInviteRequestsListResponse adminInviteRequestsList(RequestConfigurator<AdminInviteRequestsListRequest.AdminInviteRequestsListRequestBuilder> req) throws IOException, SlackApiException;

    AdminInviteRequestsApprovedListResponse adminInviteRequestsApprovedList(AdminInviteRequestsApprovedListRequest req) throws IOException, SlackApiException;

    AdminInviteRequestsApprovedListResponse adminInviteRequestsApprovedList(RequestConfigurator<AdminInviteRequestsApprovedListRequest.AdminInviteRequestsApprovedListRequestBuilder> req) throws IOException, SlackApiException;

    AdminInviteRequestsDeniedListResponse adminInviteRequestsDeniedList(AdminInviteRequestsDeniedListRequest req) throws IOException, SlackApiException;

    AdminInviteRequestsDeniedListResponse adminInviteRequestsDeniedList(RequestConfigurator<AdminInviteRequestsDeniedListRequest.AdminInviteRequestsDeniedListRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // admin.teams.admins
    // ------------------------------

    AdminTeamsAdminsListResponse adminTeamsAdminsList(AdminTeamsAdminsListRequest req) throws IOException, SlackApiException;

    AdminTeamsAdminsListResponse adminTeamsAdminsList(RequestConfigurator<AdminTeamsAdminsListRequest.AdminTeamsAdminsListRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // admin.teams
    // ------------------------------

    AdminTeamsCreateResponse adminTeamsCreate(AdminTeamsCreateRequest req) throws IOException, SlackApiException;

    AdminTeamsCreateResponse adminTeamsCreate(RequestConfigurator<AdminTeamsCreateRequest.AdminTeamsCreateRequestBuilder> req) throws IOException, SlackApiException;

    AdminTeamsListResponse adminTeamsList(AdminTeamsListRequest req) throws IOException, SlackApiException;

    AdminTeamsListResponse adminTeamsList(RequestConfigurator<AdminTeamsListRequest.AdminTeamsListRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // admin.teams.owners
    // ------------------------------

    AdminTeamsOwnersListResponse adminTeamsOwnersList(AdminTeamsOwnersListRequest req) throws IOException, SlackApiException;

    AdminTeamsOwnersListResponse adminTeamsOwnersList(RequestConfigurator<AdminTeamsOwnersListRequest.AdminTeamsOwnersListRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // admin.teams.settings
    // ------------------------------

    AdminTeamsSettingsInfoResponse adminTeamsSettingsInfo(AdminTeamsSettingsInfoRequest req) throws IOException, SlackApiException;

    AdminTeamsSettingsInfoResponse adminTeamsSettingsInfo(RequestConfigurator<AdminTeamsSettingsInfoRequest.AdminTeamsSettingsInfoRequestBuilder> req) throws IOException, SlackApiException;

    AdminTeamsSettingsSetDefaultChannelsResponse adminTeamsSettingsSetDefaultChannels(AdminTeamsSettingsSetDefaultChannelsRequest req) throws IOException, SlackApiException;

    AdminTeamsSettingsSetDefaultChannelsResponse adminTeamsSettingsSetDefaultChannels(RequestConfigurator<AdminTeamsSettingsSetDefaultChannelsRequest.AdminTeamsSettingsSetDefaultChannelsRequestBuilder> req) throws IOException, SlackApiException;

    AdminTeamsSettingsSetDescriptionResponse adminTeamsSettingsSetDescription(AdminTeamsSettingsSetDescriptionRequest req) throws IOException, SlackApiException;

    AdminTeamsSettingsSetDescriptionResponse adminTeamsSettingsSetDescription(RequestConfigurator<AdminTeamsSettingsSetDescriptionRequest.AdminTeamsSettingsSetDescriptionRequestBuilder> req) throws IOException, SlackApiException;

    AdminTeamsSettingsSetDiscoverabilityResponse adminTeamsSettingsSetDiscoverability(AdminTeamsSettingsSetDiscoverabilityRequest req) throws IOException, SlackApiException;

    AdminTeamsSettingsSetDiscoverabilityResponse adminTeamsSettingsSetDiscoverability(RequestConfigurator<AdminTeamsSettingsSetDiscoverabilityRequest.AdminTeamsSettingsSetDiscoverabilityRequestBuilder> req) throws IOException, SlackApiException;

    AdminTeamsSettingsSetIconResponse adminTeamsSettingsSetIcon(AdminTeamsSettingsSetIconRequest req) throws IOException, SlackApiException;

    AdminTeamsSettingsSetIconResponse adminTeamsSettingsSetIcon(RequestConfigurator<AdminTeamsSettingsSetIconRequest.AdminTeamsSettingsSetIconRequestBuilder> req) throws IOException, SlackApiException;

    AdminTeamsSettingsSetNameResponse adminTeamsSettingsSetName(AdminTeamsSettingsSetNameRequest req) throws IOException, SlackApiException;

    AdminTeamsSettingsSetNameResponse adminTeamsSettingsSetName(RequestConfigurator<AdminTeamsSettingsSetNameRequest.AdminTeamsSettingsSetNameRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // admin.users
    // ------------------------------

    AdminUsersAssignResponse adminUsersAssign(AdminUsersAssignRequest req) throws IOException, SlackApiException;

    AdminUsersAssignResponse adminUsersAssign(RequestConfigurator<AdminUsersAssignRequest.AdminUsersAssignRequestBuilder> req) throws IOException, SlackApiException;

    AdminUsersInviteResponse adminUsersInvite(AdminUsersInviteRequest req) throws IOException, SlackApiException;

    AdminUsersInviteResponse adminUsersInvite(RequestConfigurator<AdminUsersInviteRequest.AdminUsersInviteRequestBuilder> req) throws IOException, SlackApiException;

    AdminUsersListResponse adminUsersList(AdminUsersListRequest req) throws IOException, SlackApiException;

    AdminUsersListResponse adminUsersList(RequestConfigurator<AdminUsersListRequest.AdminUsersListRequestBuilder> req) throws IOException, SlackApiException;

    AdminUsersRemoveResponse adminUsersRemove(AdminUsersRemoveRequest req) throws IOException, SlackApiException;

    AdminUsersRemoveResponse adminUsersRemove(RequestConfigurator<AdminUsersRemoveRequest.AdminUsersRemoveRequestBuilder> req) throws IOException, SlackApiException;

    AdminUsersSetAdminResponse adminUsersSetAdmin(AdminUsersSetAdminRequest req) throws IOException, SlackApiException;

    AdminUsersSetAdminResponse adminUsersSetAdmin(RequestConfigurator<AdminUsersSetAdminRequest.AdminUsersSetAdminRequestBuilder> req) throws IOException, SlackApiException;

    AdminUsersSetExpirationResponse adminUsersSetExpiration(AdminUsersSetExpirationRequest req) throws IOException, SlackApiException;

    AdminUsersSetExpirationResponse adminUsersSetExpiration(RequestConfigurator<AdminUsersSetExpirationRequest.AdminUsersSetExpirationRequestBuilder> req) throws IOException, SlackApiException;

    AdminUsersSetOwnerResponse adminUsersSetOwner(AdminUsersSetOwnerRequest req) throws IOException, SlackApiException;

    AdminUsersSetOwnerResponse adminUsersSetOwner(RequestConfigurator<AdminUsersSetOwnerRequest.AdminUsersSetOwnerRequestBuilder> req) throws IOException, SlackApiException;

    AdminUsersSetRegularResponse adminUsersSetRegular(AdminUsersSetRegularRequest req) throws IOException, SlackApiException;

    AdminUsersSetRegularResponse adminUsersSetRegular(RequestConfigurator<AdminUsersSetRegularRequest.AdminUsersSetRegularRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // admin.users.session
    // ------------------------------

    AdminUsersSessionResetResponse adminUsersSessionReset(AdminUsersSessionResetRequest req) throws IOException, SlackApiException;

    AdminUsersSessionResetResponse adminUsersSessionReset(RequestConfigurator<AdminUsersSessionResetRequest.AdminUsersSessionResetRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // api
    // ------------------------------

    ApiTestResponse apiTest(ApiTestRequest req) throws IOException, SlackApiException;

    ApiTestResponse apiTest(RequestConfigurator<ApiTestRequest.ApiTestRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // apps
    // ------------------------------

    AppsUninstallResponse appsUninstall(AppsUninstallRequest req) throws IOException, SlackApiException;

    AppsUninstallResponse appsUninstall(RequestConfigurator<AppsUninstallRequest.AppsUninstallRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // apps.permissions
    // ------------------------------

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated
    AppsPermissionsInfoResponse appsPermissionsInfo(AppsPermissionsInfoRequest req) throws IOException, SlackApiException;

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated
    AppsPermissionsInfoResponse appsPermissionsInfo(RequestConfigurator<AppsPermissionsInfoRequest.AppsPermissionsInfoRequestBuilder> req) throws IOException, SlackApiException;

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated
    AppsPermissionsRequestResponse appsPermissionsRequest(AppsPermissionsRequestRequest req) throws IOException, SlackApiException;

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated
    AppsPermissionsRequestResponse appsPermissionsRequest(RequestConfigurator<AppsPermissionsRequestRequest.AppsPermissionsRequestRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // apps.permissions.resources
    // ------------------------------

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated
    AppsPermissionsResourcesListResponse appsPermissionsResourcesList(AppsPermissionsResourcesListRequest req) throws IOException, SlackApiException;

    // ------------------------------
    // apps.permissions.scopes
    // ------------------------------

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated
    AppsPermissionsScopesListResponse appsPermissionsScopesList(AppsPermissionsScopesListRequest req) throws IOException, SlackApiException;

    // ------------------------------
    // apps.permissions.users
    // ------------------------------

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated
    AppsPermissionsUsersListResponse appsPermissionsUsersList(AppsPermissionsUsersListRequest req) throws IOException, SlackApiException;

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated
    AppsPermissionsUsersRequestResponse appsPermissionsUsersRequest(AppsPermissionsUsersRequestRequest req) throws IOException, SlackApiException;

    // ------------------------------
    // auth
    // ------------------------------

    AuthRevokeResponse authRevoke(AuthRevokeRequest req) throws IOException, SlackApiException;

    AuthRevokeResponse authRevoke(RequestConfigurator<AuthRevokeRequest.AuthRevokeRequestBuilder> req) throws IOException, SlackApiException;

    AuthTestResponse authTest(AuthTestRequest req) throws IOException, SlackApiException;

    AuthTestResponse authTest(RequestConfigurator<AuthTestRequest.AuthTestRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // bots
    // ------------------------------

    BotsInfoResponse botsInfo(BotsInfoRequest req) throws IOException, SlackApiException;

    BotsInfoResponse botsInfo(RequestConfigurator<BotsInfoRequest.BotsInfoRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // channels
    // ------------------------------

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsArchiveResponse channelsArchive(ChannelsArchiveRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsArchiveResponse channelsArchive(RequestConfigurator<ChannelsArchiveRequest.ChannelsArchiveRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsCreateResponse channelsCreate(ChannelsCreateRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsCreateResponse channelsCreate(RequestConfigurator<ChannelsCreateRequest.ChannelsCreateRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsHistoryResponse channelsHistory(ChannelsHistoryRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsHistoryResponse channelsHistory(RequestConfigurator<ChannelsHistoryRequest.ChannelsHistoryRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsRepliesResponse channelsReplies(ChannelsRepliesRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsRepliesResponse channelsReplies(RequestConfigurator<ChannelsRepliesRequest.ChannelsRepliesRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsInfoResponse channelsInfo(ChannelsInfoRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsInfoResponse channelsInfo(RequestConfigurator<ChannelsInfoRequest.ChannelsInfoRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsListResponse channelsList(ChannelsListRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsListResponse channelsList(RequestConfigurator<ChannelsListRequest.ChannelsListRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsInviteResponse channelsInvite(ChannelsInviteRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsInviteResponse channelsInvite(RequestConfigurator<ChannelsInviteRequest.ChannelsInviteRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsJoinResponse channelsJoin(ChannelsJoinRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsJoinResponse channelsJoin(RequestConfigurator<ChannelsJoinRequest.ChannelsJoinRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsKickResponse channelsKick(ChannelsKickRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsKickResponse channelsKick(RequestConfigurator<ChannelsKickRequest.ChannelsKickRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsLeaveResponse channelsLeave(ChannelsLeaveRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsLeaveResponse channelsLeave(RequestConfigurator<ChannelsLeaveRequest.ChannelsLeaveRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsMarkResponse channelsMark(ChannelsMarkRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsMarkResponse channelsMark(RequestConfigurator<ChannelsMarkRequest.ChannelsMarkRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsRenameResponse channelsRename(ChannelsRenameRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsRenameResponse channelsRename(RequestConfigurator<ChannelsRenameRequest.ChannelsRenameRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsSetPurposeResponse channelsSetPurpose(ChannelsSetPurposeRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsSetPurposeResponse channelsSetPurpose(RequestConfigurator<ChannelsSetPurposeRequest.ChannelsSetPurposeRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsSetTopicResponse channelsSetTopic(ChannelsSetTopicRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsSetTopicResponse channelsSetTopic(RequestConfigurator<ChannelsSetTopicRequest.ChannelsSetTopicRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsUnarchiveResponse channelsUnarchive(ChannelsUnarchiveRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ChannelsUnarchiveResponse channelsUnarchive(RequestConfigurator<ChannelsUnarchiveRequest.ChannelsUnarchiveRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // chat
    // ------------------------------

    ChatGetPermalinkResponse chatGetPermalink(ChatGetPermalinkRequest req) throws IOException, SlackApiException;

    ChatGetPermalinkResponse chatGetPermalink(RequestConfigurator<ChatGetPermalinkRequest.ChatGetPermalinkRequestBuilder> req) throws IOException, SlackApiException;

    ChatDeleteResponse chatDelete(ChatDeleteRequest req) throws IOException, SlackApiException;

    ChatDeleteResponse chatDelete(RequestConfigurator<ChatDeleteRequest.ChatDeleteRequestBuilder> req) throws IOException, SlackApiException;

    ChatDeleteScheduledMessageResponse chatDeleteScheduledMessage(ChatDeleteScheduledMessageRequest req) throws IOException, SlackApiException;

    ChatDeleteScheduledMessageResponse chatDeleteScheduledMessage(RequestConfigurator<ChatDeleteScheduledMessageRequest.ChatDeleteScheduledMessageRequestBuilder> req) throws IOException, SlackApiException;

    ChatMeMessageResponse chatMeMessage(ChatMeMessageRequest req) throws IOException, SlackApiException;

    ChatMeMessageResponse chatMeMessage(RequestConfigurator<ChatMeMessageRequest.ChatMeMessageRequestBuilder> req) throws IOException, SlackApiException;

    ChatPostEphemeralResponse chatPostEphemeral(ChatPostEphemeralRequest req) throws IOException, SlackApiException;

    ChatPostEphemeralResponse chatPostEphemeral(RequestConfigurator<ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder> req) throws IOException, SlackApiException;

    ChatPostMessageResponse chatPostMessage(ChatPostMessageRequest req) throws IOException, SlackApiException;

    ChatPostMessageResponse chatPostMessage(RequestConfigurator<ChatPostMessageRequest.ChatPostMessageRequestBuilder> req) throws IOException, SlackApiException;

    ChatScheduleMessageResponse chatScheduleMessage(ChatScheduleMessageRequest req) throws IOException, SlackApiException;

    ChatScheduleMessageResponse chatScheduleMessage(RequestConfigurator<ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder> req) throws IOException, SlackApiException;

    ChatUpdateResponse chatUpdate(ChatUpdateRequest req) throws IOException, SlackApiException;

    ChatUpdateResponse chatUpdate(RequestConfigurator<ChatUpdateRequest.ChatUpdateRequestBuilder> req) throws IOException, SlackApiException;

    ChatUnfurlResponse chatUnfurl(ChatUnfurlRequest req) throws IOException, SlackApiException;

    ChatUnfurlResponse chatUnfurl(RequestConfigurator<ChatUnfurlRequest.ChatUnfurlRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // chat.scheduledMessages
    // ------------------------------

    ChatScheduledMessagesListResponse chatScheduledMessagesList(ChatScheduledMessagesListRequest req) throws IOException, SlackApiException;

    ChatScheduledMessagesListResponse chatScheduledMessagesList(RequestConfigurator<ChatScheduledMessagesListRequest.ChatScheduledMessagesListRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // conversations
    // ------------------------------

    ConversationsArchiveResponse conversationsArchive(ConversationsArchiveRequest req) throws IOException, SlackApiException;

    ConversationsArchiveResponse conversationsArchive(RequestConfigurator<ConversationsArchiveRequest.ConversationsArchiveRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsCloseResponse conversationsClose(ConversationsCloseRequest req) throws IOException, SlackApiException;

    ConversationsCloseResponse conversationsClose(RequestConfigurator<ConversationsCloseRequest.ConversationsCloseRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsCreateResponse conversationsCreate(ConversationsCreateRequest req) throws IOException, SlackApiException;

    ConversationsCreateResponse conversationsCreate(RequestConfigurator<ConversationsCreateRequest.ConversationsCreateRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsHistoryResponse conversationsHistory(ConversationsHistoryRequest req) throws IOException, SlackApiException;

    ConversationsHistoryResponse conversationsHistory(RequestConfigurator<ConversationsHistoryRequest.ConversationsHistoryRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsInfoResponse conversationsInfo(ConversationsInfoRequest req) throws IOException, SlackApiException;

    ConversationsInfoResponse conversationsInfo(RequestConfigurator<ConversationsInfoRequest.ConversationsInfoRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsInviteResponse conversationsInvite(ConversationsInviteRequest req) throws IOException, SlackApiException;

    ConversationsInviteResponse conversationsInvite(RequestConfigurator<ConversationsInviteRequest.ConversationsInviteRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsJoinResponse conversationsJoin(ConversationsJoinRequest req) throws IOException, SlackApiException;

    ConversationsJoinResponse conversationsJoin(RequestConfigurator<ConversationsJoinRequest.ConversationsJoinRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsKickResponse conversationsKick(ConversationsKickRequest req) throws IOException, SlackApiException;

    ConversationsKickResponse conversationsKick(RequestConfigurator<ConversationsKickRequest.ConversationsKickRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsLeaveResponse conversationsLeave(ConversationsLeaveRequest req) throws IOException, SlackApiException;

    ConversationsLeaveResponse conversationsLeave(RequestConfigurator<ConversationsLeaveRequest.ConversationsLeaveRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsListResponse conversationsList(ConversationsListRequest req) throws IOException, SlackApiException;

    ConversationsListResponse conversationsList(RequestConfigurator<ConversationsListRequest.ConversationsListRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsMembersResponse conversationsMembers(ConversationsMembersRequest req) throws IOException, SlackApiException;

    ConversationsMembersResponse conversationsMembers(RequestConfigurator<ConversationsMembersRequest.ConversationsMembersRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsOpenResponse conversationsOpen(ConversationsOpenRequest req) throws IOException, SlackApiException;

    ConversationsOpenResponse conversationsOpen(RequestConfigurator<ConversationsOpenRequest.ConversationsOpenRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsRenameResponse conversationsRename(ConversationsRenameRequest req) throws IOException, SlackApiException;

    ConversationsRenameResponse conversationsRename(RequestConfigurator<ConversationsRenameRequest.ConversationsRenameRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsRepliesResponse conversationsReplies(ConversationsRepliesRequest req) throws IOException, SlackApiException;

    ConversationsRepliesResponse conversationsReplies(RequestConfigurator<ConversationsRepliesRequest.ConversationsRepliesRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsSetPurposeResponse conversationsSetPurpose(ConversationsSetPurposeRequest req) throws IOException, SlackApiException;

    ConversationsSetPurposeResponse conversationsSetPurpose(RequestConfigurator<ConversationsSetPurposeRequest.ConversationsSetPurposeRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsSetTopicResponse conversationsSetTopic(ConversationsSetTopicRequest req) throws IOException, SlackApiException;

    ConversationsSetTopicResponse conversationsSetTopic(RequestConfigurator<ConversationsSetTopicRequest.ConversationsSetTopicRequestBuilder> req) throws IOException, SlackApiException;

    ConversationsUnarchiveResponse conversationsUnarchive(ConversationsUnarchiveRequest req) throws IOException, SlackApiException;

    ConversationsUnarchiveResponse conversationsUnarchive(RequestConfigurator<ConversationsUnarchiveRequest.ConversationsUnarchiveRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // dialog
    // ------------------------------

    DialogOpenResponse dialogOpen(DialogOpenRequest req) throws IOException, SlackApiException;

    DialogOpenResponse dialogOpen(RequestConfigurator<DialogOpenRequest.DialogOpenRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // dnd
    // ------------------------------

    DndEndDndResponse dndEndDnd(DndEndDndRequest req) throws IOException, SlackApiException;

    DndEndDndResponse dndEndDnd(RequestConfigurator<DndEndDndRequest.DndEndDndRequestBuilder> req) throws IOException, SlackApiException;

    DndEndSnoozeResponse dndEndSnooze(DndEndSnoozeRequest req) throws IOException, SlackApiException;

    DndEndSnoozeResponse dndEndSnooze(RequestConfigurator<DndEndSnoozeRequest.DndEndSnoozeRequestBuilder> req) throws IOException, SlackApiException;

    DndInfoResponse dndInfo(DndInfoRequest req) throws IOException, SlackApiException;

    DndInfoResponse dndInfo(RequestConfigurator<DndInfoRequest.DndInfoRequestBuilder> req) throws IOException, SlackApiException;

    DndSetSnoozeResponse dndSetSnooze(DndSetSnoozeRequest req) throws IOException, SlackApiException;

    DndSetSnoozeResponse dndSetSnooze(RequestConfigurator<DndSetSnoozeRequest.DndSetSnoozeRequestBuilder> req) throws IOException, SlackApiException;

    DndTeamInfoResponse dndTeamInfo(DndTeamInfoRequest req) throws IOException, SlackApiException;

    DndTeamInfoResponse dndTeamInfo(RequestConfigurator<DndTeamInfoRequest.DndTeamInfoRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // emoji
    // ------------------------------

    EmojiListResponse emojiList(EmojiListRequest req) throws IOException, SlackApiException;

    EmojiListResponse emojiList(RequestConfigurator<EmojiListRequest.EmojiListRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // files
    // ------------------------------

    FilesDeleteResponse filesDelete(FilesDeleteRequest req) throws IOException, SlackApiException;

    FilesDeleteResponse filesDelete(RequestConfigurator<FilesDeleteRequest.FilesDeleteRequestBuilder> req) throws IOException, SlackApiException;

    FilesInfoResponse filesInfo(FilesInfoRequest req) throws IOException, SlackApiException;

    FilesInfoResponse filesInfo(RequestConfigurator<FilesInfoRequest.FilesInfoRequestBuilder> req) throws IOException, SlackApiException;

    FilesListResponse filesList(FilesListRequest req) throws IOException, SlackApiException;

    FilesListResponse filesList(RequestConfigurator<FilesListRequest.FilesListRequestBuilder> req) throws IOException, SlackApiException;

    FilesRevokePublicURLResponse filesRevokePublicURL(FilesRevokePublicURLRequest req) throws IOException, SlackApiException;

    FilesRevokePublicURLResponse filesRevokePublicURL(RequestConfigurator<FilesRevokePublicURLRequest.FilesRevokePublicURLRequestBuilder> req) throws IOException, SlackApiException;

    FilesSharedPublicURLResponse filesSharedPublicURL(FilesSharedPublicURLRequest req) throws IOException, SlackApiException;

    FilesSharedPublicURLResponse filesSharedPublicURL(RequestConfigurator<FilesSharedPublicURLRequest.FilesSharedPublicURLRequestBuilder> req) throws IOException, SlackApiException;

    FilesUploadResponse filesUpload(FilesUploadRequest req) throws IOException, SlackApiException;

    FilesUploadResponse filesUpload(RequestConfigurator<FilesUploadRequest.FilesUploadRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // files.comments
    // ------------------------------

    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated
    FilesCommentsAddResponse filesCommentsAdd(FilesCommentsAddRequest req) throws IOException, SlackApiException;

    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated
    FilesCommentsDeleteResponse filesCommentsDelete(FilesCommentsDeleteRequest req) throws IOException, SlackApiException;

    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated
    FilesCommentsEditResponse filesCommentEdit(FilesCommentsEditRequest req) throws IOException, SlackApiException;

    // ------------------------------
    // files.remote
    // ------------------------------

    FilesRemoteAddResponse filesRemoteAdd(FilesRemoteAddRequest req) throws IOException, SlackApiException;

    FilesRemoteAddResponse filesRemoteAdd(RequestConfigurator<FilesRemoteAddRequest.FilesRemoteAddRequestBuilder> req) throws IOException, SlackApiException;

    FilesRemoteInfoResponse filesRemoteInfo(FilesRemoteInfoRequest req) throws IOException, SlackApiException;

    FilesRemoteInfoResponse filesRemoteInfo(RequestConfigurator<FilesRemoteInfoRequest.FilesRemoteInfoRequestBuilder> req) throws IOException, SlackApiException;

    FilesRemoteListResponse filesRemoteList(FilesRemoteListRequest req) throws IOException, SlackApiException;

    FilesRemoteListResponse filesRemoteList(RequestConfigurator<FilesRemoteListRequest.FilesRemoteListRequestBuilder> req) throws IOException, SlackApiException;

    FilesRemoteRemoveResponse filesRemoteRemove(FilesRemoteRemoveRequest req) throws IOException, SlackApiException;

    FilesRemoteRemoveResponse filesRemoteRemove(RequestConfigurator<FilesRemoteRemoveRequest.FilesRemoteRemoveRequestBuilder> req) throws IOException, SlackApiException;

    FilesRemoteShareResponse filesRemoteShare(FilesRemoteShareRequest req) throws IOException, SlackApiException;

    FilesRemoteShareResponse filesRemoteShare(RequestConfigurator<FilesRemoteShareRequest.FilesRemoteShareRequestBuilder> req) throws IOException, SlackApiException;

    FilesRemoteUpdateResponse filesRemoteUpdate(FilesRemoteUpdateRequest req) throws IOException, SlackApiException;

    FilesRemoteUpdateResponse filesRemoteUpdate(RequestConfigurator<FilesRemoteUpdateRequest.FilesRemoteUpdateRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // groups
    // ------------------------------

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsArchiveResponse groupsArchive(GroupsArchiveRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsArchiveResponse groupsArchive(RequestConfigurator<GroupsArchiveRequest.GroupsArchiveRequestBuilder> req) throws IOException, SlackApiException;

    // https://github.com/slackapi/slack-api-specs/issues/12
    @Deprecated
    GroupsCloseResponse groupsClose(GroupsCloseRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsCreateChildResponse groupsCreateChild(GroupsCreateChildRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsCreateChildResponse groupsCreateChild(RequestConfigurator<GroupsCreateChildRequest.GroupsCreateChildRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsCreateResponse groupsCreate(GroupsCreateRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsCreateResponse groupsCreate(RequestConfigurator<GroupsCreateRequest.GroupsCreateRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsHistoryResponse groupsHistory(GroupsHistoryRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsHistoryResponse groupsHistory(RequestConfigurator<GroupsHistoryRequest.GroupsHistoryRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsInfoResponse groupsInfo(GroupsInfoRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsInfoResponse groupsInfo(RequestConfigurator<GroupsInfoRequest.GroupsInfoRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsInviteResponse groupsInvite(GroupsInviteRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsInviteResponse groupsInvite(RequestConfigurator<GroupsInviteRequest.GroupsInviteRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsKickResponse groupsKick(GroupsKickRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsKickResponse groupsKick(RequestConfigurator<GroupsKickRequest.GroupsKickRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsLeaveResponse groupsLeave(GroupsLeaveRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsLeaveResponse groupsLeave(RequestConfigurator<GroupsLeaveRequest.GroupsLeaveRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsListResponse groupsList(GroupsListRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsListResponse groupsList(RequestConfigurator<GroupsListRequest.GroupsListRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsMarkResponse groupsMark(GroupsMarkRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsMarkResponse groupsMark(RequestConfigurator<GroupsMarkRequest.GroupsMarkRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsOpenResponse groupsOpen(GroupsOpenRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsOpenResponse groupsOpen(RequestConfigurator<GroupsOpenRequest.GroupsOpenRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsRenameResponse groupsRename(GroupsRenameRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsRenameResponse groupsRename(RequestConfigurator<GroupsRenameRequest.GroupsRenameRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsSetPurposeResponse groupsSetPurpose(GroupsSetPurposeRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsSetPurposeResponse groupsSetPurpose(RequestConfigurator<GroupsSetPurposeRequest.GroupsSetPurposeRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsSetTopicResponse groupsSetTopic(GroupsSetTopicRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsSetTopicResponse groupsSetTopic(RequestConfigurator<GroupsSetTopicRequest.GroupsSetTopicRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsUnarchiveResponse groupsUnarchive(GroupsUnarchiveRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsUnarchiveResponse groupsUnarchive(RequestConfigurator<GroupsUnarchiveRequest.GroupsUnarchiveRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsRepliesResponse groupsReplies(GroupsRepliesRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    GroupsRepliesResponse groupsReplies(RequestConfigurator<GroupsRepliesRequest.GroupsRepliesRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // im
    // ------------------------------

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ImCloseResponse imClose(ImCloseRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ImCloseResponse imClose(RequestConfigurator<ImCloseRequest.ImCloseRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ImHistoryResponse imHistory(ImHistoryRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ImHistoryResponse imHistory(RequestConfigurator<ImHistoryRequest.ImHistoryRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ImListResponse imList(ImListRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ImListResponse imList(RequestConfigurator<ImListRequest.ImListRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ImMarkResponse imMark(ImMarkRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ImMarkResponse imMark(RequestConfigurator<ImMarkRequest.ImMarkRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ImOpenResponse imOpen(ImOpenRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ImOpenResponse imOpen(RequestConfigurator<ImOpenRequest.ImOpenRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ImRepliesResponse imReplies(ImRepliesRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    ImRepliesResponse imReplies(RequestConfigurator<ImRepliesRequest.ImRepliesRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // migration
    // ------------------------------

    MigrationExchangeResponse migrationExchange(MigrationExchangeRequest req) throws IOException, SlackApiException;

    MigrationExchangeResponse migrationExchange(RequestConfigurator<MigrationExchangeRequest.MigrationExchangeRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // mpim
    // ------------------------------

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    MpimCloseResponse mpimClose(MpimCloseRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    MpimCloseResponse mpimClose(RequestConfigurator<MpimCloseRequest.MpimCloseRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    MpimHistoryResponse mpimHistory(MpimHistoryRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    MpimHistoryResponse mpimHistory(RequestConfigurator<MpimHistoryRequest.MpimHistoryRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    MpimListResponse mpimList(MpimListRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    MpimListResponse mpimList(RequestConfigurator<MpimListRequest.MpimListRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    MpimRepliesResponse mpimReplies(MpimRepliesRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    MpimRepliesResponse mpimReplies(RequestConfigurator<MpimRepliesRequest.MpimRepliesRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    MpimMarkResponse mpimMark(MpimMarkRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    MpimMarkResponse mpimMark(RequestConfigurator<MpimMarkRequest.MpimMarkRequestBuilder> req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    MpimOpenResponse mpimOpen(MpimOpenRequest req) throws IOException, SlackApiException;

    @Deprecated
        // https://api.slack.com/changelog/2020-01-deprecating-antecedents-to-the-conversations-api
    MpimOpenResponse mpimOpen(RequestConfigurator<MpimOpenRequest.MpimOpenRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // oauth
    // ------------------------------

    OAuthAccessResponse oauthAccess(OAuthAccessRequest req) throws IOException, SlackApiException;

    OAuthAccessResponse oauthAccess(RequestConfigurator<OAuthAccessRequest.OAuthAccessRequestBuilder> req) throws IOException, SlackApiException;

    OAuthV2AccessResponse oauthV2Access(OAuthV2AccessRequest req) throws IOException, SlackApiException;

    OAuthV2AccessResponse oauthV2Access(RequestConfigurator<OAuthV2AccessRequest.OAuthV2AccessRequestBuilder> req) throws IOException, SlackApiException;

    OAuthTokenResponse oauthToken(OAuthTokenRequest req) throws IOException, SlackApiException;

    OAuthTokenResponse oauthToken(RequestConfigurator<OAuthTokenRequest.OAuthTokenRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // pins
    // ------------------------------

    PinsAddResponse pinsAdd(PinsAddRequest req) throws IOException, SlackApiException;

    PinsAddResponse pinsAdd(RequestConfigurator<PinsAddRequest.PinsAddRequestBuilder> req) throws IOException, SlackApiException;

    PinsListResponse pinsList(PinsListRequest req) throws IOException, SlackApiException;

    PinsListResponse pinsList(RequestConfigurator<PinsListRequest.PinsListRequestBuilder> req) throws IOException, SlackApiException;

    PinsRemoveResponse pinsRemove(PinsRemoveRequest req) throws IOException, SlackApiException;

    PinsRemoveResponse pinsRemove(RequestConfigurator<PinsRemoveRequest.PinsRemoveRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // reactions
    // ------------------------------

    ReactionsAddResponse reactionsAdd(ReactionsAddRequest req) throws IOException, SlackApiException;

    ReactionsAddResponse reactionsAdd(RequestConfigurator<ReactionsAddRequest.ReactionsAddRequestBuilder> req) throws IOException, SlackApiException;

    ReactionsGetResponse reactionsGet(ReactionsGetRequest req) throws IOException, SlackApiException;

    ReactionsGetResponse reactionsGet(RequestConfigurator<ReactionsGetRequest.ReactionsGetRequestBuilder> req) throws IOException, SlackApiException;

    ReactionsListResponse reactionsList(ReactionsListRequest req) throws IOException, SlackApiException;

    ReactionsListResponse reactionsList(RequestConfigurator<ReactionsListRequest.ReactionsListRequestBuilder> req) throws IOException, SlackApiException;

    ReactionsRemoveResponse reactionsRemove(ReactionsRemoveRequest req) throws IOException, SlackApiException;

    ReactionsRemoveResponse reactionsRemove(RequestConfigurator<ReactionsRemoveRequest.ReactionsRemoveRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // reminders
    // ------------------------------

    RemindersAddResponse remindersAdd(RemindersAddRequest req) throws IOException, SlackApiException;

    RemindersAddResponse remindersAdd(RequestConfigurator<RemindersAddRequest.RemindersAddRequestBuilder> req) throws IOException, SlackApiException;

    RemindersCompleteResponse remindersComplete(RemindersCompleteRequest req) throws IOException, SlackApiException;

    RemindersCompleteResponse remindersComplete(RequestConfigurator<RemindersCompleteRequest.RemindersCompleteRequestBuilder> req) throws IOException, SlackApiException;

    RemindersDeleteResponse remindersDelete(RemindersDeleteRequest req) throws IOException, SlackApiException;

    RemindersDeleteResponse remindersDelete(RequestConfigurator<RemindersDeleteRequest.RemindersDeleteRequestBuilder> req) throws IOException, SlackApiException;

    RemindersInfoResponse remindersInfo(RemindersInfoRequest req) throws IOException, SlackApiException;

    RemindersInfoResponse remindersInfo(RequestConfigurator<RemindersInfoRequest.RemindersInfoRequestBuilder> req) throws IOException, SlackApiException;

    RemindersListResponse remindersList(RemindersListRequest req) throws IOException, SlackApiException;

    RemindersListResponse remindersList(RequestConfigurator<RemindersListRequest.RemindersListRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // rtm
    // ------------------------------

    RTMConnectResponse rtmConnect(RTMConnectRequest req) throws IOException, SlackApiException;

    RTMConnectResponse rtmConnect(RequestConfigurator<RTMConnectRequest.RTMConnectRequestBuilder> req) throws IOException, SlackApiException;

    RTMStartResponse rtmStart(RTMStartRequest req) throws IOException, SlackApiException;

    RTMStartResponse rtmStart(RequestConfigurator<RTMStartRequest.RTMStartRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // search
    // ------------------------------

    SearchAllResponse searchAll(SearchAllRequest req) throws IOException, SlackApiException;

    SearchAllResponse searchAll(RequestConfigurator<SearchAllRequest.SearchAllRequestBuilder> req) throws IOException, SlackApiException;

    SearchMessagesResponse searchMessages(SearchMessagesRequest req) throws IOException, SlackApiException;

    SearchMessagesResponse searchMessages(RequestConfigurator<SearchMessagesRequest.SearchMessagesRequestBuilder> req) throws IOException, SlackApiException;

    SearchFilesResponse searchFiles(SearchFilesRequest req) throws IOException, SlackApiException;

    SearchFilesResponse searchFiles(RequestConfigurator<SearchFilesRequest.SearchFilesRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // stars
    // ------------------------------

    StarsAddResponse starsAdd(StarsAddRequest req) throws IOException, SlackApiException;

    StarsAddResponse starsAdd(RequestConfigurator<StarsAddRequest.StarsAddRequestBuilder> req) throws IOException, SlackApiException;

    StarsListResponse starsList(StarsListRequest req) throws IOException, SlackApiException;

    StarsListResponse starsList(RequestConfigurator<StarsListRequest.StarsListRequestBuilder> req) throws IOException, SlackApiException;

    StarsRemoveResponse starsRemove(StarsRemoveRequest req) throws IOException, SlackApiException;

    StarsRemoveResponse starsRemove(RequestConfigurator<StarsRemoveRequest.StarsRemoveRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // team
    // ------------------------------

    TeamAccessLogsResponse teamAccessLogs(TeamAccessLogsRequest req) throws IOException, SlackApiException;

    TeamAccessLogsResponse teamAccessLogs(RequestConfigurator<TeamAccessLogsRequest.TeamAccessLogsRequestBuilder> req) throws IOException, SlackApiException;

    TeamBillableInfoResponse teamBillableInfo(TeamBillableInfoRequest req) throws IOException, SlackApiException;

    TeamBillableInfoResponse teamBillableInfo(RequestConfigurator<TeamBillableInfoRequest.TeamBillableInfoRequestBuilder> req) throws IOException, SlackApiException;

    TeamInfoResponse teamInfo(TeamInfoRequest req) throws IOException, SlackApiException;

    TeamInfoResponse teamInfo(RequestConfigurator<TeamInfoRequest.TeamInfoRequestBuilder> req) throws IOException, SlackApiException;

    TeamIntegrationLogsResponse teamIntegrationLogs(TeamIntegrationLogsRequest req) throws IOException, SlackApiException;

    TeamIntegrationLogsResponse teamIntegrationLogs(RequestConfigurator<TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder> req) throws IOException, SlackApiException;

    TeamProfileGetResponse teamProfileGet(TeamProfileGetRequest req) throws IOException, SlackApiException;

    TeamProfileGetResponse teamProfileGet(RequestConfigurator<TeamProfileGetRequest.TeamProfileGetRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // usergroups
    // ------------------------------

    UsergroupsCreateResponse usergroupsCreate(UsergroupsCreateRequest req) throws IOException, SlackApiException;

    UsergroupsCreateResponse usergroupsCreate(RequestConfigurator<UsergroupsCreateRequest.UsergroupsCreateRequestBuilder> req) throws IOException, SlackApiException;

    UsergroupsDisableResponse usergroupsDisable(UsergroupsDisableRequest req) throws IOException, SlackApiException;

    UsergroupsDisableResponse usergroupsDisable(RequestConfigurator<UsergroupsDisableRequest.UsergroupsDisableRequestBuilder> req) throws IOException, SlackApiException;

    UsergroupsEnableResponse usergroupsEnable(UsergroupsEnableRequest req) throws IOException, SlackApiException;

    UsergroupsEnableResponse usergroupsEnable(RequestConfigurator<UsergroupsEnableRequest.UsergroupsEnableRequestBuilder> req) throws IOException, SlackApiException;

    UsergroupsListResponse usergroupsList(UsergroupsListRequest req) throws IOException, SlackApiException;

    UsergroupsListResponse usergroupsList(RequestConfigurator<UsergroupsListRequest.UsergroupsListRequestBuilder> req) throws IOException, SlackApiException;

    UsergroupsUpdateResponse usergroupsUpdate(UsergroupsUpdateRequest req) throws IOException, SlackApiException;

    UsergroupsUpdateResponse usergroupsUpdate(RequestConfigurator<UsergroupsUpdateRequest.UsergroupsUpdateRequestBuilder> req) throws IOException, SlackApiException;

    UsergroupsUsersListResponse usergroupsUsersList(UsergroupsUsersListRequest req) throws IOException, SlackApiException;

    UsergroupsUsersListResponse usergroupsUsersList(RequestConfigurator<UsergroupsUsersListRequest.UsergroupsUsersListRequestBuilder> req) throws IOException, SlackApiException;

    UsergroupsUsersUpdateResponse usergroupsUsersUpdate(UsergroupsUsersUpdateRequest req) throws IOException, SlackApiException;

    UsergroupsUsersUpdateResponse usergroupsUsersUpdate(RequestConfigurator<UsergroupsUsersUpdateRequest.UsergroupsUsersUpdateRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // users
    // ------------------------------

    UsersConversationsResponse usersConversations(UsersConversationsRequest req) throws IOException, SlackApiException;

    UsersConversationsResponse usersConversations(RequestConfigurator<UsersConversationsRequest.UsersConversationsRequestBuilder> req) throws IOException, SlackApiException;

    UsersDeletePhotoResponse usersDeletePhoto(UsersDeletePhotoRequest req) throws IOException, SlackApiException;

    UsersDeletePhotoResponse usersDeletePhoto(RequestConfigurator<UsersDeletePhotoRequest.UsersDeletePhotoRequestBuilder> req) throws IOException, SlackApiException;

    UsersGetPresenceResponse usersGetPresence(UsersGetPresenceRequest req) throws IOException, SlackApiException;

    UsersGetPresenceResponse usersGetPresence(RequestConfigurator<UsersGetPresenceRequest.UsersGetPresenceRequestBuilder> req) throws IOException, SlackApiException;

    UsersIdentityResponse usersIdentity(UsersIdentityRequest req) throws IOException, SlackApiException;

    UsersIdentityResponse usersIdentity(RequestConfigurator<UsersIdentityRequest.UsersIdentityRequestBuilder> req) throws IOException, SlackApiException;

    UsersInfoResponse usersInfo(UsersInfoRequest req) throws IOException, SlackApiException;

    UsersInfoResponse usersInfo(RequestConfigurator<UsersInfoRequest.UsersInfoRequestBuilder> req) throws IOException, SlackApiException;

    UsersListResponse usersList(UsersListRequest req) throws IOException, SlackApiException;

    UsersListResponse usersList(RequestConfigurator<UsersListRequest.UsersListRequestBuilder> req) throws IOException, SlackApiException;

    UsersLookupByEmailResponse usersLookupByEmail(UsersLookupByEmailRequest req) throws IOException, SlackApiException;

    UsersLookupByEmailResponse usersLookupByEmail(RequestConfigurator<UsersLookupByEmailRequest.UsersLookupByEmailRequestBuilder> req) throws IOException, SlackApiException;

    UsersSetActiveResponse usersSetActive(UsersSetActiveRequest req) throws IOException, SlackApiException;

    UsersSetActiveResponse usersSetActive(RequestConfigurator<UsersSetActiveRequest.UsersSetActiveRequestBuilder> req) throws IOException, SlackApiException;

    UsersSetPhotoResponse usersSetPhoto(UsersSetPhotoRequest req) throws IOException, SlackApiException;

    UsersSetPhotoResponse usersSetPhoto(RequestConfigurator<UsersSetPhotoRequest.UsersSetPhotoRequestBuilder> req) throws IOException, SlackApiException;

    UsersSetPresenceResponse usersSetPresence(UsersSetPresenceRequest req) throws IOException, SlackApiException;

    UsersSetPresenceResponse usersSetPresence(RequestConfigurator<UsersSetPresenceRequest.UsersSetPresenceRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // users.profile
    // ------------------------------

    UsersProfileGetResponse usersProfileGet(UsersProfileGetRequest req) throws IOException, SlackApiException;

    UsersProfileGetResponse usersProfileGet(RequestConfigurator<UsersProfileGetRequest.UsersProfileGetRequestBuilder> req) throws IOException, SlackApiException;

    UsersProfileSetResponse usersProfileSet(UsersProfileSetRequest req) throws IOException, SlackApiException;

    UsersProfileSetResponse usersProfileSet(RequestConfigurator<UsersProfileSetRequest.UsersProfileSetRequestBuilder> req) throws IOException, SlackApiException;

    // ------------------------------
    // views
    // ------------------------------

    ViewsOpenResponse viewsOpen(ViewsOpenRequest req) throws IOException, SlackApiException;

    ViewsOpenResponse viewsOpen(RequestConfigurator<ViewsOpenRequest.ViewsOpenRequestBuilder> req) throws IOException, SlackApiException;

    ViewsPushResponse viewsPush(ViewsPushRequest req) throws IOException, SlackApiException;

    ViewsPushResponse viewsPush(RequestConfigurator<ViewsPushRequest.ViewsPushRequestBuilder> req) throws IOException, SlackApiException;

    ViewsUpdateResponse viewsUpdate(ViewsUpdateRequest req) throws IOException, SlackApiException;

    ViewsUpdateResponse viewsUpdate(RequestConfigurator<ViewsUpdateRequest.ViewsUpdateRequestBuilder> req) throws IOException, SlackApiException;

    ViewsPublishResponse viewsPublish(ViewsPublishRequest req) throws IOException, SlackApiException;

    ViewsPublishResponse viewsPublish(RequestConfigurator<ViewsPublishRequest.ViewsPublishRequestBuilder> req) throws IOException, SlackApiException;

}
