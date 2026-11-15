package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import app.notifee.core.event.LogEvent;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import p036d5.C6947a;
import p036d5.C6949c;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessagingService extends AbstractServiceC6720i {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private C6949c rpc;

    private boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    private void f(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (N.t(extras)) {
            N n10 = new N(extras);
            ExecutorService executorServiceE = AbstractC6726o.e();
            try {
                if (new C6717f(this, n10, executorServiceE).a()) {
                    executorServiceE.shutdown();
                    return;
                } else {
                    executorServiceE.shutdown();
                    if (L.E(intent)) {
                        L.w(intent);
                    }
                }
            } catch (Throwable th) {
                executorServiceE.shutdown();
                throw th;
            }
        }
        onMessageReceived(new W(extras));
    }

    private String g(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private C6949c h(Context context) {
        if (this.rpc == null) {
            this.rpc = new C6949c(context.getApplicationContext());
        }
        return this.rpc;
    }

    private void i(Intent intent) {
        if (!e(intent.getStringExtra("google.message_id"))) {
            j(intent);
        }
        h(this).b(new C6947a(intent));
    }

    private void j(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                L.y(intent);
                f(intent);
                break;
            case "send_error":
                onSendError(g(intent), new a0(intent.getStringExtra(LogEvent.LEVEL_ERROR)));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC6720i
    protected Intent getStartCommandIntent(Intent intent) {
        return b0.b().c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC6720i
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            i(intent);
            return;
        }
        if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra(EXTRA_TOKEN));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(@NonNull W w10) {
    }

    @Deprecated
    public void onMessageSent(@NonNull String str) {
    }

    public void onNewToken(String str) {
    }

    @Deprecated
    public void onSendError(@NonNull String str, @NonNull Exception exc) {
    }

    void setRpcForTesting(C6949c c6949c) {
        this.rpc = c6949c;
    }
}
