package com.miningmafia.app.auth

import android.app.Activity
import androidx.credentials.CredentialManager
import androidx.credentials.CustomCredential
import androidx.credentials.GetCredentialRequest
import com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential

data class GoogleUser(val email: String, val displayName: String?, val idToken: String)

/**
 * Google Sign-In through Credential Manager. Requires an OAuth "Web application" client ID
 * (GOOGLE_WEB_CLIENT_ID). The ID token should also be verified server-side in production.
 */
object GoogleAuth {
    suspend fun signIn(activity: Activity, serverClientId: String): Result<GoogleUser> = runCatching {
        require(serverClientId.isNotBlank()) {
            "Google Sign-In is not configured. Set GOOGLE_WEB_CLIENT_ID in gradle.properties."
        }
        val option = GetSignInWithGoogleOption.Builder(serverClientId).build()
        val request = GetCredentialRequest.Builder().addCredentialOption(option).build()
        val response = CredentialManager.create(activity).getCredential(activity, request)
        val credential = response.credential
        require(
            credential is CustomCredential &&
                credential.type == GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL
        ) { "Unexpected credential returned by Google" }
        val google = GoogleIdTokenCredential.createFrom(credential.data)
        GoogleUser(email = google.id, displayName = google.displayName, idToken = google.idToken)
    }
}
