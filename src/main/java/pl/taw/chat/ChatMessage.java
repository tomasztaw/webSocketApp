/**
 * Created by tomasz_taw
 * Date: 04.11.2023
 * Time: 17:10
 * Project Name: chatWebSocket
 * Description:
 */
package pl.taw.chat;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType type;
}
