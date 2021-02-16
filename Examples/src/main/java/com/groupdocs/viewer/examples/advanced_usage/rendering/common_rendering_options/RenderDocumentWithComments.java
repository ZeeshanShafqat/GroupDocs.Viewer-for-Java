package com.groupdocs.viewer.examples.advanced_usage.rendering.common_rendering_options;

import com.groupdocs.viewer.Viewer;
import com.groupdocs.viewer.examples.SampleFiles;
import com.groupdocs.viewer.examples.Utils;
import com.groupdocs.viewer.options.HtmlViewOptions;

import java.io.File;

public class RenderDocumentWithComments {

    /**
     * This example demonstrates how to render document with comments.
     */

    public static void run() {
        String outputDirectory = Utils.getOutputDirectoryPath("RenderDocumentWithComments");
        String pageFilePathFormat = new File(outputDirectory, "page_{0}.html").getPath();

        HtmlViewOptions viewOptions = HtmlViewOptions.forEmbeddedResources(pageFilePathFormat);
        viewOptions.setRenderComments(true);

        try (Viewer viewer = new Viewer(SampleFiles.SAMPLE_DOCX_WITH_COMMENT)) {
            viewer.view(viewOptions);
        }

        System.out.println(
                "\nSource document rendered successfully.\nCheck output in " + outputDirectory);
    }
}