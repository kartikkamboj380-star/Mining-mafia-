package p036d5;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Messenger f43135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f43136b;

    y(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f43135a = new Messenger(iBinder);
            this.f43136b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f43136b = new l(iBinder);
            this.f43135a = null;
        }
    }

    final void a(Message message) throws RemoteException {
        Messenger messenger = this.f43135a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        l lVar = this.f43136b;
        if (lVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        lVar.b(message);
    }
}
