package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5168sr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C5168sr> CREATOR = new C5294tr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ParcelFileDescriptor f33239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Parcelable f33240b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33241c = true;

    public C5168sr(ParcelFileDescriptor parcelFileDescriptor) {
        this.f33239a = parcelFileDescriptor;
    }

    public final SafeParcelable a(Parcelable.Creator creator) {
        if (this.f33241c) {
            if (this.f33239a == null) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.c("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f33239a));
            try {
                try {
                    int i11 = dataInputStream.readInt();
                    byte[] bArr = new byte[i11];
                    dataInputStream.readFully(bArr, 0, i11);
                    IOUtils.closeQuietly(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i11);
                        parcelObtain.setDataPosition(0);
                        this.f33240b = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.f33241c = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e10) {
                    int i12 = AbstractC0786o0.f2696b;
                    L4.p.d("Could not read from parcel file descriptor", e10);
                    IOUtils.closeQuietly(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                IOUtils.closeQuietly(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.f33240b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f33239a == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.f33240b.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        AbstractC2315Qt.f22473a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.rr
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() throws Throwable {
                                Parcelable.Creator<C5168sr> creator = C5168sr.CREATOR;
                                byte[] bArr = bArrMarshall;
                                OutputStream outputStream = autoCloseOutputStream;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            IOUtils.closeQuietly(dataOutputStream2);
                                        } catch (IOException e10) {
                                            e = e10;
                                            dataOutputStream = dataOutputStream2;
                                            int i11 = AbstractC0786o0.f2696b;
                                            L4.p.d("Error transporting the ad response", e);
                                            G4.t.l().j(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                IOUtils.closeQuietly(outputStream);
                                            } else {
                                                IOUtils.closeQuietly(dataOutputStream);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                IOUtils.closeQuietly(outputStream);
                                            } else {
                                                IOUtils.closeQuietly(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e11) {
                                        e = e11;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        });
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (IOException e10) {
                        e = e10;
                        int i11 = AbstractC0786o0.f2696b;
                        L4.p.d("Error transporting the ad response", e);
                        G4.t.l().j(e, "LargeParcelTeleporter.pipeData.2");
                        IOUtils.closeQuietly(autoCloseOutputStream);
                    }
                } catch (IOException e11) {
                    e = e11;
                    autoCloseOutputStream = null;
                }
                this.f33239a = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f33239a, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
