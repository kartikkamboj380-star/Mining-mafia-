package com.miningmafia.app.data.remote;

import com.miningmafia.app.data.remote.model.AuthResponse;
import com.miningmafia.app.data.remote.model.AccountBalance;
import com.miningmafia.app.data.remote.model.MiningStatus;
import com.miningmafia.app.data.remote.model.WithdrawalRequest;
import com.miningmafia.app.data.remote.model.WithdrawalResponse;
import com.miningmafia.app.data.remote.model.Transaction;
import com.miningmafia.app.data.remote.model.WalletSummary;
import com.miningmafia.app.data.remote.model.ApiError;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Authorized provider API interface.
 *
 * NOTE: These endpoint signatures are PLACEHOLDERS based on common pool/wallet patterns.
 * The real CT Pool API endpoints cannot be verified without access to the CT Pool ZIP,
 * which is currently inaccessible (Google Drive connector failing). The user must point
 * this client at their actual authorized backend and adjust the signatures to match the
 * real, documented provider API.
 */
public interface BackendApi {

    // ---------- Authentication ----------
    @POST("auth/register")
    Call<AuthResponse> register(@Body Map<String, String> body);

    @POST("auth/login")
    Call<AuthResponse> login(@Body Map<String, String> body);

    @POST("auth/verify-email")
    Call<Void> verifyEmail(@Body Map<String, String> body);

    @POST("auth/reset-password")
    Call<Void> resetPassword(@Body Map<String, String> body);

    @POST("auth/google")
    Call<AuthResponse> googleSignIn(@Body Map<String, String> body);

    @POST("auth/logout")
    Call<Void> logout(@Header("Authorization") String authorization);

    // ---------- Accounts ----------
    @GET("accounts")
    Call<List<AccountBalance>> listAccounts(@Header("Authorization") String authorization);

    @POST("accounts/link")
    Call<AccountBalance> linkAccount(@Header("Authorization") String authorization,
                                     @Body Map<String, String> body);

    @POST("accounts/{id}/unlink")
    Call<Void> unlinkAccount(@Header("Authorization") String authorization,
                             @Path("id") String accountId);

    // ---------- Wallet / Balance ----------
    @GET("wallet/balance")
    Call<WalletSummary> getWalletSummary(@Header("Authorization") String authorization);

    @GET("wallet/transactions")
    Call<List<Transaction>> listTransactions(@Header("Authorization") String authorization,
                                             @Query("limit") Integer limit,
                                             @Query("offset") Integer offset);

    // ---------- Mining ----------
    @GET("mining/status")
    Call<MiningStatus> getMiningStatus(@Header("Authorization") String authorization);

    @POST("mining/start")
    Call<MiningStatus> startMining(@Header("Authorization") String authorization,
                                   @Body Map<String, String> body);

    @POST("mining/stop")
    Call<MiningStatus> stopMining(@Header("Authorization") String authorization);

    // ---------- Withdrawals ----------
    @GET("withdrawals")
    Call<List<WithdrawalRequest>> listWithdrawals(@Header("Authorization") String authorization);

    @POST("withdrawals")
    Call<WithdrawalResponse> createWithdrawal(@Header("Authorization") String authorization,
                                              @Body WithdrawalRequest request);
}
