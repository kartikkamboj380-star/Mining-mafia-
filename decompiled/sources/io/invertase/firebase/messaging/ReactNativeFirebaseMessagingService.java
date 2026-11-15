package io.invertase.firebase.messaging;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.W;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onDeletedMessages() {
        p089i8.g.i().o(u.c());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(W w10) {
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageSent(String str) {
        p089i8.g.i().o(u.b(str));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        p089i8.g.i().o(u.d(str));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onSendError(String str, Exception exc) {
        p089i8.g.i().o(u.a(str, exc));
    }
}
