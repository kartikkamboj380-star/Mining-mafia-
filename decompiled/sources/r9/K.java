package r9;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class K extends C7120x {
    private final Long v(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // r9.C7120x, r9.AbstractC7112o
    public void c(T source, T target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Files.move(source.n(), target.n(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // r9.C7120x, r9.AbstractC7112o
    public C7111n m(T path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return u(path.n());
    }

    @Override // r9.C7120x
    public String toString() {
        return "NioSystemFileSystem";
    }

    protected final C7111n u(Path nioPath) {
        Intrinsics.checkNotNullParameter(nioPath, "nioPath");
        try {
            BasicFileAttributes attributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) com.reactnativecommunity.asyncstorage.c.a(), LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(nioPath) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            T tF = symbolicLink != null ? T.a.f(T.f48391b, symbolicLink, false, 1, null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lV = fileTimeCreationTime != null ? v(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lV2 = fileTimeLastModifiedTime != null ? v(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C7111n(zIsRegularFile, zIsDirectory, tF, lValueOf, lV, lV2, fileTimeLastAccessTime != null ? v(fileTimeLastAccessTime) : null, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }
}
