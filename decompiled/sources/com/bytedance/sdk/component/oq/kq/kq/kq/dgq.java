package com.bytedance.sdk.component.oq.kq.kq.kq;

import com.bytedance.sdk.component.oq.kq.nze;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class dgq extends nze {
    HttpURLConnection kq;
    InputStream oq;

    dgq(HttpURLConnection httpURLConnection) {
        this.kq = httpURLConnection;
        this.oq = new rjo(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.oq.kq.nze
    public InputStream bob() {
        return this.oq;
    }

    @Override // com.bytedance.sdk.component.oq.kq.nze, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.oq.close();
            this.kq.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.oq.kq.nze
    public com.bytedance.sdk.component.oq.kq.dgq csi() {
        if (this.kq.getContentType() != null) {
            return com.bytedance.sdk.component.oq.kq.dgq.kq(this.kq.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.oq.kq.nze
    public byte[] fou() {
        try {
            byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i10 = this.oq.read(bArr);
                if (i10 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.oq.kq.nze
    public long kq() {
        try {
            return this.kq.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.oq.kq.nze
    public String oq() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.oq));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = stringBuffer.toString();
                    close();
                    return string;
                }
                stringBuffer.append(line + "\n");
            }
        } catch (Exception unused) {
            return "";
        }
    }

    dgq(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.kq = httpURLConnection;
        this.oq = new rjo(inputStream, httpURLConnection);
    }
}
