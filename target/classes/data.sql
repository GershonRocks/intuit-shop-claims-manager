INSERT INTO users (id) VALUES
                           ('a93adc57-4d59-4a9d-85c6-b5d48d99101d'),
                           ('a872d86a-c7cb-48b7-b5d9-f218d6845405'),
                           ('dcb6a039-b0fc-49dd-b5de-58856f66727d'),
                           ('bbbb080d-cffa-46d0-aa22-786c35d1a35b'),
                           ('f22dff3f-06cf-49fe-97ec-bf7afe9a7fdb'),
                           ('72dddc34-f058-4d31-b370-e88f772ea8e8'),
                           ('a90f6dd7-b74b-4be6-9065-daa1a92ba7ab'),
                           ('a227c2bd-358a-4587-95f0-61fb63678952'),
                           ('8145b0d6-feb2-4ff6-8546-c0a5eece6f82');

INSERT INTO purchases (id) VALUES
                               ('f256c996-6dcb-40cf-8dce-a11fa9bcab6b'),
                               ('21d5dbe2-8369-459d-a955-a6b4f19b4d53'),
                               ('340d04f5-4241-4cc3-bfb4-861c5c552891'),
                               ('30de333b-d7da-4906-b382-1a8ff59556ff'),
                               ('4933d1ce-9ca7-4640-ba17-e442057c44f1'),
                               ('e11cc042-80f4-4a0b-b580-d1eedf6b153c'),
                               ('57cd80e4-ed5b-4d7e-a39d-15d039cb2069'),
                               ('0797d85e-ae2e-482a-ae38-26ab83a8947e'),
                               ('c2437271-ec14-40fe-92cc-22284ab3a25f'),
                               ('4b8d0786-a2e8-45cf-8d89-faa390c098df'),
                               ('c7f07884-2faf-4c6e-8a51-c6256812d73b'),
                               ('af0676a6-542f-44c6-ae9d-1c0da4c4f1b3');

INSERT INTO complaints (id, userId, purchaseId, subject, content) VALUES
                                                                      (UUID(), 'a93adc57-4d59-4a9d-85c6-b5d48d99101d', 'f256c996-6dcb-40cf-8dce-a11fa9bcab6b', 'Delayed delivery', 'I have not received my product yet.'),
                                                                      (UUID(), 'a872d86a-c7cb-48b7-b5d9-f218d6845405', '21d5dbe2-8369-459d-a955-a6b4f19b4d53', 'Wrong item received', 'The item I received is different from what I ordered.'),
                                                                      (UUID(), 'dcb6a039-b0fc-49dd-b5de-58856f66727d', '340d04f5-4241-4cc3-bfb4-861c5c552891', 'Product quality issue', 'The product quality is not as expected.'),
                                                                      (UUID(), 'bbbb080d-cffa-46d0-aa22-786c35d1a35b', '30de333b-d7da-4906-b382-1a8ff59556ff', 'Refund not processed', 'I returned my order but havent received a refund.'),
(UUID(), 'f22dff3f-06cf-49fe-97ec-bf7afe9a7fdb', '4933d1ce-9ca7-4640-ba17-e442057c44f1', 'Delivery at wrong address', 'My order was delivered to the wrong address.');
